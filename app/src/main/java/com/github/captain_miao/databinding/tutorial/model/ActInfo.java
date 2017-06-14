package com.github.captain_miao.databinding.tutorial.model;

/**
 * @author YanLu
 * @since 16/4/24
 */
public class ActInfo extends BaseModel{
    private static final long serialVersionUID = 1L;


    public enum ActEnum {
        ACT_A,
        ACT_B,
        ACT_C
    }


    private String name;
    private String url;

    public ActInfo(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
