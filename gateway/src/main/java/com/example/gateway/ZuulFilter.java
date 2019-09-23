package com.example.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

/**
 * @Author Liyong
 * @Date 2019/9/6 16:04
 **/
@Component
public class ZuulFilter extends com.netflix.zuul.ZuulFilter {
    @Autowired
    Tracer tracer;
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        tracer.addTag("operator","liyong");
        System.out.println(tracer.getCurrentSpan().traceIdString());
        return null;
    }
}
