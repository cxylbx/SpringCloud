package com.springcloud.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.springcloud.sentinel.service.SentinelTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 刘宝星
 * @date 2023/4/10 21:30
 */
@RestController
public class SentinelTestController {

    @Resource
    private SentinelTestService sentinelTestService;

    @GetMapping("/test01")
    @SentinelResource(value = "test01", blockHandler = "exception")
    public String test01(@RequestParam(value = "param", required = false) String param){
        return "test01";
    }

    public String exception(String param, BlockException e) {
        return "错误代码";
    }

    @GetMapping("/test02")
    @SentinelResource(value = "test02")
    public String test02(){
        return "test02";
    }

    @GetMapping("/test03")
    public String test03(){
        return sentinelTestService.test01();
    }
}
