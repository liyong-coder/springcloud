package com.example.hystrix.service;

import com.example.hystrix.fallback.OrderServiceFallBack;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Author Liyong
 * @Date 2019/8/29 10:17
 **/
@FeignClient(value = "service-hi")
@Component
public interface ServiceHiService {

        @HystrixCommand(fallbackMethod = "hiError")
        @RequestMapping(value = "/hi",method = RequestMethod.POST)
        String getMess();


}
