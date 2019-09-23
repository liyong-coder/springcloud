package com.example.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Liyong
 * @Date 2019/9/6 15:06
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/hi")
    public String hi(){
        return "hello,liyong";
    }

    @Autowired
    private UserServiceFeign userServiceFeign;

    @GetMapping("/userService")
    public String test() {
        return userServiceFeign.sayHiUserService();
    }
}
