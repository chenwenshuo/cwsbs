package com.cws.mapper;

import com.cws.entity.WeixinUser;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WeixinUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WeixinUser record);

    WeixinUser selectByPrimaryKey(Integer id);

    List<WeixinUser> selectAll();

    int updateByPrimaryKey(WeixinUser record);
    
    WeixinUser selectByOpenId(@Param("openId") String openId);
    
    List<WeixinUser> selectEmail();
    
    List<WeixinUser> selectRemind(@Param("remindHour") Integer remindHour, @Param("remindMinute") Integer remindMinute);
}