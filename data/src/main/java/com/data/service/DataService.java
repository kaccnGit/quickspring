package com.data.service;

import com.data.fallback.DataFallback;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: huzhiyong
 * @description: 订单详情服务
 * @create: 2019-10-15 11:02
 **/
@FeignClient(value = "data", fallback = DataFallback.class)
public interface DataService {

    @RequestLine("POST /orderDetails/findOrderDetailsByOrderId?orderId={orderId}")
    String getdata(@Param(value = "orderId") Long orderId);
}
