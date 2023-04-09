package com.cxylbx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 程序启动器
 * @author liubaoxing
 * @date 2023/2/21 16:57
 */
@EnableHystrix
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain02 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain02.class);
    }
}
