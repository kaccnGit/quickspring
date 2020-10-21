package com.data.fallback;

import com.data.StatusCode;
import com.data.service.DataService;
import com.netflix.hystrix.exception.HystrixBadRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: user
 * @description: DataOrderDetailsFallback
 * @create: 2020-10-21 09:30
 **/
@Component
@Slf4j
public class DataFallback implements DataService {

    @Override
    public String getdata(Long orderId) {
        log.info("data模块 findOrderDetailsByOrderId 断路器触发");
        throw new HystrixBadRequestException(StatusCode.SERVICE_ERROR_MSG);
    }
}
