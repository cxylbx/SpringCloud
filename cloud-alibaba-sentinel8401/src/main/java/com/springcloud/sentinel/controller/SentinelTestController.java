package com.springcloud.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘宝星
 * @date 2023/4/10 21:30
 */
@RestController
public class SentinelTestController {

    @GetMapping("/test01")
    public String test01(){
        return "test01";
    }

    @GetMapping("/test02")
    public String test02(){
        return "test02";
    }
}
