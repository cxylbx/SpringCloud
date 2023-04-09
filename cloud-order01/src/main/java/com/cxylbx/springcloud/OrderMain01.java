package com.cxylbx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 程序启动类
 * @author liubaoxing
 * @date 2023/2/22 10:09
 */
@EnableEurekaClient
@SpringBootApplication
public class OrderMain01 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain01.class);
    }
}
