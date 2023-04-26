package com.cloud.seata.service;

import com.cloud.seata.factory.InventoryServiceFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 刘宝星
 * @date 2023/4/25 20:57
 */
@FeignClient(value = "seata-inventory", fallbackFactory = InventoryServiceFactory.class )
public interface InventoryService {

    @GetMapping("/inventory")
    String getInventory();
}
