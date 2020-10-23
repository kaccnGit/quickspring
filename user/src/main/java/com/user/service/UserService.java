package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: kaccn
 * @description:
 * @create: 2020-10-21 15:10
 **/

@RestController
@RequestMapping("user")
public class UserService {

    @Autowired
    private FeignService feignService;

    @GetMapping("/getuserdata")
    public String getUserData(@RequestParam Long id) {
        String s = feignService.getdata(id);
        return s;
    }
}
