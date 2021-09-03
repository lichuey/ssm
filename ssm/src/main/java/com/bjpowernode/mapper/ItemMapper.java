package com.bjpowernode.mapper;

import com.bjpowernode.pojo.Item;

import java.util.ArrayList;

public interface ItemMapper {

    //查询所有商品
    ArrayList<Item> selectAllItem();

    //添加商品
    void insertItem(Item item);

    //通过ID查询商品
    Item selectItemById(int i_id);

    //修改商品
    void updateItem(Item item);

    //通过ID删除商品
    void deleteItemById(int i_id);

    //按商品名称查询商品
    ArrayList<Item> selectItemByName(String itemName);
}
