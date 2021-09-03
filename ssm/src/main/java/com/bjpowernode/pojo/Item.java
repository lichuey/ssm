package com.bjpowernode.pojo;

/**
 * 商品类
 */
public class Item {
    //商品ID
    private int i_id;
    //商品名称
    private String i_name;
    //商品价格
    private float i_price;
    //商品描述
    private String i_describe;
    //商品图片
    private String i_picture;
    //商店类
    private Store store;

    public int getI_id() {
        return i_id;
    }

    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    public String getI_name() {
        return i_name;
    }

    public void setI_name(String i_name) {
        this.i_name = i_name;
    }

    public float getI_price() {
        return i_price;
    }

    public void setI_price(float i_price) {
        this.i_price = i_price;
    }

    public String getI_describe() {
        return i_describe;
    }

    public void setI_describe(String i_describe) {
        this.i_describe = i_describe;
    }

    public String getI_picture() {
        return i_picture;
    }

    public void setI_picture(String i_picture) {
        this.i_picture = i_picture;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
