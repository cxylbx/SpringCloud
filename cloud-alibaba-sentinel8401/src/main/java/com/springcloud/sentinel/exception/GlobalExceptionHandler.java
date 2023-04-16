package com.springcloud.sentinel.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 *
 * @author liubaoxing
 * @date 2023-04-16
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BlockException.class)
    public String flowException(BlockException e) {
        return "全局异常捕获~~~限流";
    }

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e) {
        Throwable cause = e.getCause();
        if (cause instanceof BlockException) {
            return "全局异常捕获~~~限流1111";
        }
        return "全局异常处理：" + e.getClass() + "  message:" + e.getMessage();
    }
}
