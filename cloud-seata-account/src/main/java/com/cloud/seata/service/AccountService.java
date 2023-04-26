package com.cloud.seata.service;

import com.cloud.seata.mapper.AccountMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 刘宝星
 * @date 2023/4/25 20:59
 */
@Service("accountService")
public class AccountService {

    @Resource
    private AccountMapper accountMapper;

    public int updateAccount() {
        return accountMapper.updateAccount(1L, 1);
    }
}
