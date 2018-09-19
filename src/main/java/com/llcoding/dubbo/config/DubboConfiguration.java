package com.llcoding.dubbo.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 初始化Dubbo
 */
@Configuration
public class DubboConfiguration {

    /**
     * springboot应用名称
     */
    @Value("${spring.application.name}")
    private String name;

    /**
     * 注册中心协议
     */
    @Value("${dubbo.registry.protocol}")
    private String protocol;

    /**
     * 注册中心地址
     */
    @Value("${dubbo.registry.address}")
    private String address;

    /**
     * 登录注册中心客户端
     */
    @Value("${dubbo.registry.client}")
    private String client;

    /**
     * 应用信息配置
     *
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        // 应用名称
        applicationConfig.setName(name);
        return applicationConfig;
    }

    /**
     * 注册中心配置
     *
     * @return
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        // 注册中心协议
        registryConfig.setProtocol(protocol);
        // 注册中心地址
        registryConfig.setAddress(address);
        // 登录注册中心客户端
        registryConfig.setClient(client);
        return registryConfig;
    }

}