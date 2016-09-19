package com.github.captain_miao.databinding.tutorial.helper;

/**
 * @author YanLu
 * @since 16/9/19
 */
public class MyDataBindingComponent implements android.databinding.DataBindingComponent {
    @Override
    public ImageViewBindingInterface getImageViewBindingInterface() {
        return new ImageViewBinding4Picasso();
    }
}
