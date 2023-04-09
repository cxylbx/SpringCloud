package com.lbx.springcloud.controller;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author 刘宝星
 * @date 2023/4/6 22:19
 */
@RestController
@RequestMapping("/test")
public class MessageController {

    @Resource
    private StreamBridge streamBridge;

    @GetMapping
    public void send() {
        String serialNumber = UUID.randomUUID().toString();
        System.out.println("测试生产者:" + serialNumber);
        // 生产消息
        // 第一个参数是绑定名称，格式为：自定义的绑定名称-out-0，myBroadcast是自定义的绑定名称，out代表生产者，0是固定写法
        // 自定义的绑定名称必须与消费方法的方法名保持一致
        // 第二个参数是发送的消息实体
        streamBridge.send("test-out-0", serialNumber);
    }
}
