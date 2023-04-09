package com.springcloud.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 刘宝星
 * @date 2023/4/9 16:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaClient3377 {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaClient3377.class);
    }
}
