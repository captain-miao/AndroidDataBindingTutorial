package com.github.captain_miao.databinding.tutorial;

import android.os.Bundle;
import android.view.View;

import com.github.captain_miao.databinding.tutorial.base.BaseActivity;
import com.github.captain_miao.databinding.tutorial.databinding.LoadImageByPicassoBinding;

import java.security.SecureRandom;

public class SimpleActivityB extends BaseActivity implements View.OnClickListener {
    private LoadImageByPicassoBinding mBinding;
    @Override
    public void init(Bundle savedInstanceState) {
        mBinding = LoadImageByPicassoBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        mBinding.btnChangeImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mBinding.setImgUrl(getRandomImage());
    }


    private String getRandomImage() {
      SecureRandom secureRandom = new SecureRandom();
        return images[secureRandom.nextInt(9)];
    }

    private String[] images = new String[]{
            "http://ww1.sinaimg.cn/large/7a8aed7bjw1f2sm0ns82hj20f00l8tb9.jpg",
            "http://ww4.sinaimg.cn/large/7a8aed7bjw1f2tpr3im0mj20f00l6q4o.jpg",
            "http://ww4.sinaimg.cn/large/610dc034jw1f2uyg3nvq7j20gy0p6myx.jpg",
            "http://ww2.sinaimg.cn/large/7a8aed7bjw1f2w0qujoecj20f00kzjtt.jpg",
            "http://ww3.sinaimg.cn/large/7a8aed7bjw1f2x7vxkj0uj20d10mi42r.jpg",
            "http://ww1.sinaimg.cn/large/7a8aed7bjw1f2zwrqkmwoj20f00lg0v7.jpg",
            "http://ww2.sinaimg.cn/large/7a8aed7bjw1f30sgi3jf0j20iz0sg40a.jpg",
            "http://ww4.sinaimg.cn/large/7a8aed7bjw1f32d0cumhkj20ey0mitbx.jpg",
            "http://ww2.sinaimg.cn/large/610dc034gw1f35cxyferej20dw0i2789.jpg",
            "http://ww2.sinaimg.cn/large/7a8aed7bjw1f340c8jrk4j20j60srgpf.jpg"
    };
}