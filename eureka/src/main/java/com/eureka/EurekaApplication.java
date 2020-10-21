package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: user
 * @description: 服务注册中心
 * @create: 2020-10-13 13:53
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    /**
     * 注册中心入口
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
