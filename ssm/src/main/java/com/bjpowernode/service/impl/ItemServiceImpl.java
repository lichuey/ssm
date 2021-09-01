package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.ItemMapper;
import com.bjpowernode.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;
}
