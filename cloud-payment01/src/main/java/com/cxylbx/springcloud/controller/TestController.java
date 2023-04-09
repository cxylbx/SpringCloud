package com.cxylbx.springcloud.controller;

import cn.hutool.core.thread.ThreadUtil;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liubaoxing
 * @date 2023/2/23 17:24
 */
@RestController
@RequestMapping("/test")
@DefaultProperties(defaultFallback = "fallback")
public class TestController {

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping
    public String test(){
        return serverPort;
    }

    @GetMapping("/01")
    @HystrixCommand(fallbackMethod = "fallback", commandProperties = {
            //设置调用者执行的超时时间
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
            //开启断路器
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            //该属性用来没置在滚动时间窗中，断路器熔断的最小请求数。例如，默认该值为20的时候
            //如果滚动时间窗（默认10秒）内仅收到了19个请求，即使这19个请求都失败了，断路器也不会打开。
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            //断路器跳闸后，在此值的时间的内，hystrix会拒绝新的请求，只有过了这个时间断路器才会打开闸门
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"),
            //该属性用来没置在滚动时间窗中，表示在滚动时间窗中，在请求数量超过
            //circuitBreaker.requestVolumeThreshold的情况下，如果错误
            //请求数的百分比超过60,就把断路器设置为“打开”状态，否则就设置为“关闭”状态。
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
    })
    public String test01(){
        ThreadUtil.sleep(5000);
        List<String> services = discoveryClient.getServices();
        return String.join("", services);
    }

    @GetMapping("/02")
    public String test02(){
        List<String> services = discoveryClient.getServices();
        return String.join("", services);
    }

    public String fallback() {
        return "错误";
    }
}
