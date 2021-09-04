package com.bjpowernode.controller;

import com.bjpowernode.pojo.Item;
import com.bjpowernode.pojo.Store;
import com.bjpowernode.service.ItemService;
import com.bjpowernode.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    String addItem(Item item, @RequestParam("picName") MultipartFile picName) throws IOException {
        getNewName(item, picName);
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
    @RequestMapping(value = "editItem",method = RequestMethod.POST)
    String editItem(Item item, @RequestParam("picName") MultipartFile picName) throws IOException {
        getNewName(item, picName);
        itemService.editItem(item);
        return "redirect:itemList.action";
    }

    //通过ID删除商品
    @RequestMapping("delete")
    String delete(int i_id) {
        itemService.deleteItemById(i_id);
        return "redirect:itemList.action";
    }

    //获取新名字
    private void getNewName(Item item, @RequestParam("picName") MultipartFile picName) throws IOException {
        //新名字不加后缀
        String nowNameNotSux = UUID.randomUUID().toString();
        //获取老名字
        String oldName = picName.getOriginalFilename();
        //获取老名字后缀
        String sux = oldName.substring(oldName.lastIndexOf("."));
        //得到新名字
        String nowName = nowNameNotSux + sux;
        //创建文件流
        File file = new File("D:\\webWork\\" + nowName);
        //将文件写入本地
        picName.transferTo(file);
        //更新名字
        item.setI_picture(nowName);
    }
}
