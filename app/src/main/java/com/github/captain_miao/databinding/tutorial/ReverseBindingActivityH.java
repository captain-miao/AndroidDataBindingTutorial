package com.github.captain_miao.databinding.tutorial;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;

import com.github.captain_miao.databinding.tutorial.base.BaseActivity;
import com.github.captain_miao.databinding.tutorial.databinding.ActReverseBindingBinding;
import com.github.captain_miao.databinding.tutorial.presenter.PresenterValue;

public class ReverseBindingActivityH extends BaseActivity implements PresenterValue {

    @Override
    public void init(Bundle savedInstanceState) {
        String def = "Hello DataBinding";
        ActReverseBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.act_reverse_binding);
        binding.setDefValue(def);
        binding.setInitValue(def);
        binding.setPresenter(this);
    }

    @Override
    public void onValue(String value) {
        Toast.makeText(ReverseBindingActivityH.this, value, Toast.LENGTH_SHORT).show();
    }
}
