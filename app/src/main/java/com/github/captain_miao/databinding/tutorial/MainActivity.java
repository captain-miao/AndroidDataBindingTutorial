package com.github.captain_miao.databinding.tutorial;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.github.captain_miao.databinding.tutorial.databinding.ActivityMainBinding;
import com.github.captain_miao.databinding.tutorial.helper.ActivityNavigation;
import com.github.captain_miao.databinding.tutorial.listener.OnViewClickListener;
import com.github.captain_miao.databinding.tutorial.model.ActInfo;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements OnViewClickListener {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setClickListener(this);
        binding.setMap(mActInfoMap);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        if(v instanceof Button) {
            String name = ((Button) v).getText().toString();
            ActivityNavigation.from(this).toUri(mActInfoMap.get(name).getUrl());
        }
    }

    private Map<String, ActInfo> mActInfoMap = new HashMap<String, ActInfo>() {{
        put("change_color", new ActInfo("change_color", "tutorial://databinding/activity_a"));
        put("change_image", new ActInfo("change_image", "tutorial://databinding/activity_b"));
        put("activity_c", new ActInfo("activity_c", "tutorial://databinding/activity_c"));
    }};
}
