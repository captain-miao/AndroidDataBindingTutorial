package com.github.captain_miao.databinding.tutorial;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.github.captain_miao.databinding.tutorial.base.BaseActivity;
import com.github.captain_miao.databinding.tutorial.databinding.ChangeTxtColorBinding;
import com.github.captain_miao.databinding.tutorial.helper.MockRandomData;

public class SimpleActivityA extends BaseActivity implements View.OnClickListener {

    private ChangeTxtColorBinding mBinding;

    @Override
    public void init(Bundle savedInstanceState) {
        mBinding = DataBindingUtil.setContentView(this, R.layout.change_txt_color);

        mBinding.btnChangeColor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mBinding.setTxtColor(MockRandomData.getRandomColor());
    }

}
