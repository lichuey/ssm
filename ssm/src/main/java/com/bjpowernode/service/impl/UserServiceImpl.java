package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.UserMapper;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //判断账号密码是否正确
    @Override
    public Boolean findUsernameAndPassword(String username, String password) {
        int result = userMapper.selectUsernameAndPassword(username, password);
        if (result > 0) {
            //查询到结果，表示账号密码正确
            return true;
        } else {
            //错误
            return false;
        }
    }
}
