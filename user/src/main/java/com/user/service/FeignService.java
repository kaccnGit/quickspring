package com.user.service;

import com.user.config.GlobalConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author: kaccn
 * @description: DataService
 * @create: 2020-10-21 15:21
 **/
@FeignClient(value = "data", configuration = GlobalConfiguration.class)
@Component
public interface FeignService {

    @RequestLine("GET /producer/getdata?id={id}")
    String getdata(@Param(value = "id") Long id);

}
