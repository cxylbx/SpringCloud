package com.cxylbx.springcloud.controller;

import com.cxylbx.springcloud.service.OrderService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试类
 * @author 刘宝星
 * @date 2022-03-22
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private OrderService orderService;

    @GetMapping
    public int test(){
        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("CLOUD-PAYMENT");
        ServiceInstance instance = orderService.getInstance(serviceInstanceList);
        return instance.getPort();
    }
}
