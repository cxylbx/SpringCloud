package com.springcloud.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 刘宝星
 * @date 2023/4/10 21:29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelApplication8401 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication8401.class);
    }
}
