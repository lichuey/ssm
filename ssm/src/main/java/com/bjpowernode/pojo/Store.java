package com.bjpowernode.pojo;

/**
 * 商店类
 */
public class Store {
    //商店ID
    private int s_id;
    //商店名称
    private String s_name;
    //商店类型
    private String s_type;
    //商店地址
    private String address;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_type() {
        return s_type;
    }

    public void setS_type(String s_type) {
        this.s_type = s_type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
