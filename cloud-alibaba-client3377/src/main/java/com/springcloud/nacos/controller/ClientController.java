package com.springcloud.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘宝星
 * @date 2023/4/9 16:02
 */
@RestController
@RequestMapping
@RefreshScope//支持nacos的动态刷新机制
public class ClientController {

    @Value("${config.version}")
    private String configVersion;

    @GetMapping("/test")
    public String test() {
        return configVersion;
    }
}
