package com.github.captain_miao.databinding.tutorial.recycleview;

import android.view.View;

/**
 * @author YanLu
 * @since 16/5/20
 */
public interface OnClickVehicleItem<T> {
    void onClick(View v, T vehicleInfo );
}
