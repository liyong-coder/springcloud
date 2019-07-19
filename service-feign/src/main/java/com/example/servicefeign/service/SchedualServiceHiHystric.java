package com.example.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author: liyong
 * @date: 2019/7/17 0017 8:59
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}
