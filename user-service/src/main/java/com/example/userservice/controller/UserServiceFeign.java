package com.example.userservice.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author Liyong
 * @Date 2019/9/12 16:50
 **/
@FeignClient(value = "SERVICE-HI")
@RequestMapping(value = "/service-hi")
public interface UserServiceFeign {

    @RequestMapping(value = "/hi",method = RequestMethod.POST)
    String sayHiUserService();
}
