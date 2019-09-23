package com.example.hystrix.fallback;

import com.example.hystrix.service.ServiceHiService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Author Liyong
 * @Date 2019/8/29 10:23
 **/
@Component
public class OrderServiceFallBack implements FallbackFactory<ServiceHiService> {
    @Override
    public ServiceHiService create(Throwable throwable) {
        return new ServiceHiService() {
            @Override
            public String getMess() {
                return "服务已关闭";
            }
        };
    }
}
