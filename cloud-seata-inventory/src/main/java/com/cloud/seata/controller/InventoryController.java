package com.cloud.seata.controller;

import com.cloud.seata.service.InventoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 刘宝星
 * @date 2023/4/25 21:12
 */
@RestController
public class InventoryController {

    @Resource
    private InventoryService inventoryService;

    @GetMapping("/inventory")
    public String testSeata(){
        int i = inventoryService.updateInventory();
        return i > 0 ? "成功" : "失败";
    }
}
