package com.springcloud.sentinel.service.impl;

import com.springcloud.sentinel.service.SentinelTestService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author 刘宝星
 * @date 2023/4/18 20:16
 */
@Component
public class SentinelTestServiceImpl implements FallbackFactory<SentinelTestService> {

    @Override
    public SentinelTestService create(Throwable cause) {
        return () -> "错误代码" + cause.getMessage();
    }
}
