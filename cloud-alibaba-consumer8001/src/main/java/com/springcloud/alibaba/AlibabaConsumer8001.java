package com.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 刘宝星
 * @date 2023/4/9 14:52
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaConsumer8001 {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaConsumer8001.class);
    }
}
