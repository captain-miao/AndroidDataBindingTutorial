package com.github.captain_miao.databinding.tutorial.recycleview;

import com.github.captain_miao.databinding.tutorial.model.VehicleInfo;

/**
 * @author YanLu
 * @since 16/6/21
 */
public interface RvPresenter {
    void onItemClick(VehicleInfo info );
    void onSelectedClick(VehicleInfo info );
}
