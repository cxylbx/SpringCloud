package com.cxylbx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务注册中心启动器
 * @author liubaoxing
 * @date 2023/2/22 14:53
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerMain {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMain.class);
    }
}
