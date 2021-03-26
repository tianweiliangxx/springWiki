package com.hailiang.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.name: TEST}")
    private String testName;

    /**
     * resful是一种风格 ：/hello/1 === /hello?id=1
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello World" + testName;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World Post-" + name;
    }
}
