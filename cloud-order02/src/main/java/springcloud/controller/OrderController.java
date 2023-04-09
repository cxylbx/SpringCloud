package springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.service.OrderService;

import javax.annotation.Resource;

/**
 * 测试类
 * @author 刘宝星
 * @date 2022-03-22
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping
    public String test(){
        return orderService.test();
    }
}
