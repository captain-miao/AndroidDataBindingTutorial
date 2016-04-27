package com.github.captain_miao.databinding.tutorial.model;

import android.databinding.ObservableBoolean;

/**
 * @author YanLu
 * @since 16/4/27
 */
public class VehicleInfo extends BaseModel {

    private ObservableBoolean isSelected;
    private String  logoUrl;
    private String  brand;
    private String  description;

    public VehicleInfo(ObservableBoolean isSelected, String logoUrl, String brand, String description) {
        this.isSelected = isSelected;
        this.logoUrl = logoUrl;
        this.brand = brand;
        this.description = description;
    }

    public ObservableBoolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(ObservableBoolean isSelected) {
        this.isSelected = isSelected;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
