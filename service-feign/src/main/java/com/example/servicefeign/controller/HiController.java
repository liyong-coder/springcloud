package com.example.servicefeign.controller;

import com.example.servicefeign.service.SchedualServiceHi;
import com.example.servicefeign.service.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liyong
 * @date: 2019/7/16 0016 17:21
 */
@RestController
public class HiController {


    @Autowired
    SchedualServiceHi schedualServiceHi;

    @Autowired
    UserServiceFeign userServiceFeign;
    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        String str = name+":Feign";
        return schedualServiceHi.sayHiFromClientOne(str);
    }
    @GetMapping(value = "/user/hi")
    public String sayHi() {
        return userServiceFeign.sayHiUserService();
    }

}



