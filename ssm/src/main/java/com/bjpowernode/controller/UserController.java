package com.bjpowernode.controller;

import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password, HttpServletRequest req) {
        Boolean result = userService.findUsernameAndPassword(username, password);
        if (result) {
            //账号密码正确，返回到商品列表页面
            return "redirect:itemList.action";
        } else {
            //账号密码错误，返回到登录页面
            req.getSession().setAttribute("username", username);
            req.getSession().setAttribute("password", password);
            return "forward:index.jsp";
        }
    }
}
