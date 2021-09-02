package com.bjpowernode.controller;

import com.bjpowernode.service.UserService;
import com.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(User user) {
        Boolean result = userService.findUsernameAndPassword(user.getUsername(), user.getPassword());
        if (result) {
            //账号密码正确，返回到商品列表页面
            return "redirect:itemList.action";
        } else {
            //账号密码错误，返回到登录页面
            return "forward:index.jsp";
        }
    }
}
