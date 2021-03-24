package com.hailiang.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * resful是一种风格 ：/hello/1 === /hello?id=1
     * @return
     */

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
