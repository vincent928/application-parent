package com.moon.index.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@Api(value = "用户接口",tags = {"userapi","testapi"})
@RequestMapping("/user")
public class UserController {

    @Resource
    private RestTemplate restTemplate;


    @RequestMapping(value = "show", method = RequestMethod.GET)
    public String showUser() {
        String object = restTemplate.getForObject("http://APPLICATION-USER-SERVICE/user/show", String.class);
        return object;
    }

    @ApiResponses(value = {@ApiResponse(code=2000,message = "测试通过",response = String.class),
            @ApiResponse(code = 1009,message = "测试失败")})
    @ApiOperation(value = "测试接口swagger2")  //接口描述
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String testApi(String username) {
        return username;
    }
}
