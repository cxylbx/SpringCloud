package com.springcloud.sentinel.service;

import com.springcloud.sentinel.service.impl.SentinelTestServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 刘宝星
 * @date 2023/4/18 20:16
 */
@FeignClient(value = "alibaba-provider", fallbackFactory = SentinelTestServiceImpl.class)
public interface SentinelTestService {

    @GetMapping("/test01")
    String test01();
}
