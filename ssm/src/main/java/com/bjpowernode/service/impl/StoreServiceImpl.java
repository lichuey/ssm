package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.StoreMapper;
import com.bjpowernode.pojo.Store;
import com.bjpowernode.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    //查询所有商店
    @Override
    public List<Store> findAllStore() {
        return storeMapper.selectAllStore();
    }
}
