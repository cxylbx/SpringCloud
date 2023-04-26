package com.cloud.seata.service;

import com.cloud.seata.mapper.OrderMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 刘宝星
 * @date 2023/4/25 20:57
 */
@Service("orderService")
public class OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private AccountService accountService;

    @Resource
    private InventoryService inventoryService;

    @GlobalTransactional(name = "test-seata", rollbackFor = Exception.class)
    public String testSeata() throws Exception {
        orderMapper.updateOrder(1L, 1);

        accountService.getAccount();

        inventoryService.getInventory();

        int i = orderMapper.updateOrder(2L, 2);
        if (i <= 0) {
            throw new Exception("错误");
        }
        return "成功";
    }
}
