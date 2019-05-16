package com.wy.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: PersonalStudy
 * @description: 测试服务类
 * @author: Wuyong
 * @create: 2019-04-28 15:56
 **/
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
