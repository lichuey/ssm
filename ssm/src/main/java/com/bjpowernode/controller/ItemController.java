package com.bjpowernode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

    @Autowired
    private ItemController itemController;

    @RequestMapping("itemList")
    private String itemList() {
        return "itemList";
    }
}
