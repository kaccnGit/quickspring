package com.data.service.impl;

import com.data.service.DataService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: user
 * @description: DataServiceImpl
 * @create: 2020-10-21 09:20
 **/
@RestController
@RequestMapping("data")
public class DataServiceImpl implements DataService {

    @PostMapping("/findUserOpenByOpenid")
    public String getdata(Long orderId) {
        return "I'm your DATA";
    }
}
