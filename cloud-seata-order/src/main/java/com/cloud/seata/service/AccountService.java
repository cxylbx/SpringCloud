package com.cloud.seata.service;

import com.cloud.seata.factory.AccountServiceFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 刘宝星
 * @date 2023/4/25 20:59
 */
@FeignClient(value = "seata-account", fallbackFactory = AccountServiceFactory.class)
public interface AccountService {

    @GetMapping("/account")
    String getAccount();
}
