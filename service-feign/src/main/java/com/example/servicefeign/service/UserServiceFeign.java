package com.example.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author Liyong
 * @Date 2019/9/12 16:02
 **/
@FeignClient(value = "user-service",fallback = SchedualServiceHiHystric.class)
public interface UserServiceFeign {

    @RequestMapping(value = "/user/hi",method = RequestMethod.GET)
    String sayHiUserService();
}
