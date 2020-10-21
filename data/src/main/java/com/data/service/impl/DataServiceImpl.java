package com.data.service.impl;

import com.data.service.DataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: kaccn
 * @description: DataServiceImpl
 * @create: 2020-10-21 11:40
 **/
@RestController
@RequestMapping("data")
public class DataServiceImpl implements DataService {

    @RequestMapping("/getdata")
    public String getdata(Long orderId) {
        return "I'm your DATA";
    }
}
