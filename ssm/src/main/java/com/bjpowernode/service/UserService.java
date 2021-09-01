package com.bjpowernode.service;

public interface UserService {

    //判断账号密码是否正确
    Boolean findUsernameAndPassword(String username, String password);
}
