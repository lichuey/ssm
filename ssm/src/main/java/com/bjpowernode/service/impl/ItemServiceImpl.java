package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.ItemMapper;
import com.bjpowernode.pojo.Item;
import com.bjpowernode.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    //查询所有商品
    @Override
    public ArrayList<Item> findAllItem() {
        return itemMapper.selectAllItem();
    }

    //添加商品
    @Override
    public void addItem(Item item) {
        itemMapper.insertItem(item);
    }

    //通过ID查询商品
    @Override
    public Item findItemById(int i_id) {
        return itemMapper.selectItemById(i_id);
    }

    //修改商品
    @Override
    public void editItem(Item item) {
        itemMapper.updateItem(item);
    }

    //通过ID删除商品
    @Override
    public void deleteItemById(int i_id) {
        itemMapper.deleteItemById(i_id);
    }
}
