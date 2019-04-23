package com.cws.mapper;

import com.cws.entity.Discount;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DiscountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Discount record);

    Discount selectByPrimaryKey(Integer id);

    List<Discount> selectAll();

    int updateByPrimaryKey(Discount record);
    
    /**
     * 根据openId查找用户
     * @param openId
     * @return
     */
    Discount selectByOpenId(@Param("openId") String openId);
}