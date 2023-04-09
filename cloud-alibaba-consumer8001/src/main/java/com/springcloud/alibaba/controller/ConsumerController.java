package com.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 刘宝星
 * @date 2023/4/9 14:53
 */
@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        return restTemplate.getForObject("http://alibaba-provider/test01", String.class);
    }
}
