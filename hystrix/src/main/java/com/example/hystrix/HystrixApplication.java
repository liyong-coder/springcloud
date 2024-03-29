package com.example.hystrix;

import com.example.hystrix.service.ServiceHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient
public class HystrixApplication {

    @Autowired
    private ServiceHiService serviceHiService;

    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }


    @RequestMapping("/hystricHi")
    String getMess(){
       return serviceHiService.getMess();
    }
}
