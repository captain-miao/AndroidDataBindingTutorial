package com.github.captain_miao.databinding.tutorial;

import android.os.Bundle;

import com.github.captain_miao.databinding.tutorial.base.BaseActivity;

public class SimpleActivityC extends BaseActivity {

    @Override
    public void init(Bundle savedInstanceState) {
        setContentView(R.layout.fragment_simple);
        if (savedInstanceState == null) {
            addFragment(R.id.frg_container, SimpleFragmentC.class);
        }
    }
}
