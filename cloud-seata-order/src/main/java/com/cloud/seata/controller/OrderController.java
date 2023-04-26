package com.cloud.seata.controller;

import com.cloud.seata.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 刘宝星
 * @date 2023/4/25 21:19
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/seata")
    public String testSeata() throws Exception {
        return orderService.testSeata();
    }
}
