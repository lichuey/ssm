package com.bjpowernode.controller;

import com.bjpowernode.pojo.Item;
import com.bjpowernode.pojo.Store;
import com.bjpowernode.service.ItemService;
import com.bjpowernode.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private StoreService storeService;

    //查询所有商品
    @RequestMapping("itemList")
    void itemList(ArrayList<Item> beanList) {
        List<Item> list = itemService.findAllItem();
        beanList.addAll(list);
    }

    //按商品名称查询商品
    @RequestMapping("itemListByName")
    String itemListByName(ArrayList<Item> list,String itemName) {
        list.addAll(itemService.findAllItemByName(itemName));
        return "item/itemList";
    }

    //添加商品前的准备
    @RequestMapping("add")
    List<Store> add() {
        //查询所有商店
        return storeService.findAllStore();
    }

    //添加商品
    @RequestMapping("addItem")
    String addItem(Item item) {
        itemService.addItem(item);
        return "redirect:itemList.action";
    }

    //编辑商品前的准备
    @RequestMapping("edit")
    Item edit(ArrayList<Store> list, int i_id) {
        //添加商店列表数据
        list.addAll(storeService.findAllStore());
        //通过ID查询商品
        return itemService.findItemById(i_id);
    }

    //修改商品
    @RequestMapping("editItem")
    String editItem(Item item) {
        itemService.editItem(item);
        return "redirect:itemList.action";
    }

    //通过ID删除商品
    @RequestMapping("delete")
    String delete(int i_id) {
        itemService.deleteItemById(i_id);
        return "redirect:itemList.action";
    }
}
