package com.moon.index.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Author : moon
 * Date  : 2018/11/28 17:50
 * Description : Class for
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "show", method = RequestMethod.GET)
    public String showUser() {
        String object = restTemplate.getForObject("http://APPLICATION-USER-SERVICE/user/show", String.class);
        return object;
    }

}
