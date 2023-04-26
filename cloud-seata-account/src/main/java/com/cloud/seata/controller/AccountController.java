package com.cloud.seata.controller;

import com.cloud.seata.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 刘宝星
 * @date 2023/4/25 21:12
 */
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping("/account")
    public String testSeata(){
        int i = accountService.updateAccount();
        return i > 0 ? "成功" : "失败";
    }
}
