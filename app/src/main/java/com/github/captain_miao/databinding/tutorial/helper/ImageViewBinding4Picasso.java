package com.github.captain_miao.databinding.tutorial.helper;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * @author YanLu
 * @since 16/9/19
 */
public class ImageViewBinding4Picasso implements ImageViewBindingInterface {

    @Override
    public void loadImage(ImageView view, String url) {
        Picasso.with(view.getContext()).load(url).into(view);
    }

    @Override
    public void loadImage(ImageView view, String url, Drawable error) {
        Picasso.with(view.getContext()).load(url).into(view);
    }
}
