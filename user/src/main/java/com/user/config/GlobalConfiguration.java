package com.user.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: kaccn
 * @description: 自定义配置类
 * @create: 2020-10-23 11:27
 **/
@Configuration
@ComponentScanExclude
public class GlobalConfiguration {

    @Bean
    public Contract GlobalContract() {
        return new Contract.Default();
    }
}
