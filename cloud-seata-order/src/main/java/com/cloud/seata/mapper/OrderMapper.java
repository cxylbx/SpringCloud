package com.cloud.seata.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author 刘宝星
 * @date 2023/4/25 21:07
 */
@Mapper
public interface OrderMapper {

    @Update("update tb_order set cou = #{count} where id = #{id}")
    int updateOrder(@Param("id") Long id, @Param("count") Integer count);
}
