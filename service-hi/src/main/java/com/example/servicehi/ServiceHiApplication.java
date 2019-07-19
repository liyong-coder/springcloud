package com.example.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }


    @Value("${message}")
    String mess;

    @Value("${username}")
    String username;

    @Value("${password}")
    String password;

    @RequestMapping("/hi")
    public String getMess() {
        return  mess;
    }

    @RequestMapping("/get")
    public String getUserAndPass(){
        return "用户名:"+username+",密码:"+password;
    }
}
