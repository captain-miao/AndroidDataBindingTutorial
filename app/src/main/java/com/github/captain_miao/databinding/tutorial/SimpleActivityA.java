package com.github.captain_miao.databinding.tutorial;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.github.captain_miao.databinding.tutorial.base.BaseActivity;
import com.github.captain_miao.databinding.tutorial.databinding.ChangeTxtColorBinding;
import com.github.captain_miao.databinding.tutorial.helper.MockRandomData;
import com.github.captain_miao.databinding.tutorial.presenter.OnClickEvent;

public class SimpleActivityA extends BaseActivity implements OnClickEvent {

    private ChangeTxtColorBinding mBinding;

    @Override
    public void init(Bundle savedInstanceState) {
        mBinding = DataBindingUtil.setContentView(this, R.layout.change_txt_color);

        mBinding.setOnClickEvent(this);
    }

    @Override
    public void onClick() {
        mBinding.setTxtColor(MockRandomData.getRandomColor());
    }

}
