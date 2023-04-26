package com.cloud.seata.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author 刘宝星
 * @date 2023/4/25 21:15
 */
@Mapper
public interface AccountMapper {

    @Update("update account set cou = #{count} where id = #{id}")
    int updateAccount(@Param("id") Long id, @Param("count") Integer count);
}
