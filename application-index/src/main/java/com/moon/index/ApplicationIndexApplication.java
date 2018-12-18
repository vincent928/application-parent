package com.moon.index;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @EnableDiscoveryClient是通用的客户端注解配置,
 * 如果确定服务注册中心是Eureka，也可以使用
 * @EnableEurekaClient
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ApplicationIndexApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationIndexApplication.class, args);
    }

    //开启负载均衡
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
