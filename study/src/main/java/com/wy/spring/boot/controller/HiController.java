package com.wy.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: PersonalStudy
 * @description:
 * @author: Wuyong
 * @create: 2019-04-28 16:29
 **/
@Controller
public class HiController {
    @RequestMapping("/hi")
    public String hi(){
        return "index";
    }
}
