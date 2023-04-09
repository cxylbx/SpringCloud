package com.lbx.springcloud.listener;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

/**
 * @author 刘宝星
 * @date 2023/4/6 22:18
 */
@Component
public class StreamListener {

    /**
     * 方法名必须与生产消息时自定义的绑定名称一致
     */
    @Bean
    public Consumer<String> test() {
        return message -> System.out.println("Received message " + message);
    }
}
