package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return "hello springboot";
    }

    @RequestMapping("/test1")
    public String test1() {
        return "index";
    }
}
