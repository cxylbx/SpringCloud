package com.cloud.seata.factory;

import com.cloud.seata.service.AccountService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author 刘宝星
 * @date 2023/4/25 21:03
 */
@Component
public class InventoryServiceFactory implements FallbackFactory<AccountService> {

    @Override
    public AccountService create(Throwable throwable) {
        return () -> "账户错误信息：" + throwable.getMessage();
    }
}
