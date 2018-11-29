package com.moon.userservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : moon
 * Date  : 2018/11/28 16:36
 * Description : Class for
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "show", method = RequestMethod.GET)
    public String showUser() {
        return "I'm user";
    }


}
