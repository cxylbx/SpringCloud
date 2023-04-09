package com.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘宝星
 * @date 2023/4/9 14:17
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/test01")
    public String test01(){
        return serverPort + "生产者9002";
    }
}
