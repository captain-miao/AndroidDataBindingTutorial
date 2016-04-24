package com.github.captain_miao.databinding.tutorial;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.github.captain_miao.databinding.tutorial.base.BaseActivity;
import com.github.captain_miao.databinding.tutorial.databinding.ChangeTxtColorBinding;

import java.security.SecureRandom;

public class SimpleActivityA extends BaseActivity implements View.OnClickListener {

    private ChangeTxtColorBinding mBinding;

    @Override
    public void init(Bundle savedInstanceState) {
        mBinding = DataBindingUtil.setContentView(this, R.layout.change_txt_color);
        //mBinding = ChangeTxtColorBinding.in()

        mBinding.btnChangeColor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mBinding.setTxtColor(getRandomColor());
        mBinding.setVariable(BR.txtColor, getRandomColor());
    }


    private int getRandomColor() {
      SecureRandom rgb = new SecureRandom();
      return Color.HSVToColor(150, new float[]{
              rgb.nextInt(359), 1, 1
      });
    }
}
