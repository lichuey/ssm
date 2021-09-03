package com.bjpowernode.service;

import com.bjpowernode.pojo.Item;

import java.util.ArrayList;

public interface ItemService {

    //查询所有商品
    ArrayList<Item> findAllItem();

    //添加商品
    void addItem(Item item);

    //通过ID查询商品
    Item findItemById(int i_id);

    //修改商品
    void editItem(Item item);

    //通过ID删除商品
    void deleteItemById(int i_id);

    //按商品名称查询商品
    ArrayList<Item> findAllItemByName(String itemName);
}
