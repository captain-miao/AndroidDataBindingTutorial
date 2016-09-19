package com.github.captain_miao.databinding.tutorial.helper;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * @author YanLu
 * @since 16/9/19
 */
public interface ImageViewBindingInterface {

    @BindingAdapter({"imageUrl"})
    public  void loadImage(ImageView view, String url);

    @BindingAdapter({"imageUrl", "error"})
    public  void loadImage(ImageView view, String url, Drawable error);
}
