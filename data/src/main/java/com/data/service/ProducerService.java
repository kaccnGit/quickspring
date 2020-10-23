package com.data.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: kaccn
 * @description: ProducerService
 * @create: 2020-10-21 11:40
 **/
@RestController
@RequestMapping("producer")
public class ProducerService {

    @RequestMapping("/getdata")
    public String getdata(Long id) {
        return "I'm your DATA" + id;
    }
}
