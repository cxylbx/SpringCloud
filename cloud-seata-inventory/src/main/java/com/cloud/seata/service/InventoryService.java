package com.cloud.seata.service;

import com.cloud.seata.mapper.InventoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 刘宝星
 * @date 2023/4/25 20:57
 */
@Service("inventoryService")
public class InventoryService {

    @Resource
    private InventoryMapper inventoryMapper;

    public int updateInventory() {
        return inventoryMapper.updateInventory(1L, 1);
    }
}
