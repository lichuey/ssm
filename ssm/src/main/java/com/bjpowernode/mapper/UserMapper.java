package com.bjpowernode.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //判断账号密码是否正确
    int selectUsernameAndPassword(@Param("username") String username,@Param("password") String password);
}
