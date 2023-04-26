package com.cloud.seata.factory;

import com.cloud.seata.service.InventoryService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author 刘宝星
 * @date 2023/4/25 21:03
 */
@Component
public class AccountServiceFactory implements FallbackFactory<InventoryService> {

    @Override
    public InventoryService create(Throwable throwable) {
        return () -> "库存错误信息：" + throwable.getMessage();
    }
}
