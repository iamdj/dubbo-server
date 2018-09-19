package com.llcoding.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.llcoding.dubbo.service.HelloService;

@Service(timeout = 5000)
public class HelloServiceImpl implements HelloService {

    @Override
    public String hi(String name) {
        return "hi " + name;
    }

}