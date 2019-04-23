package com.cws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cws.entity.Discount;
import com.cws.mapper.DiscountMapper;
import com.cws.service.DiscountService;
import com.cws.service.RedisClient;

@Service("discountService")
@Transactional
public class DiscountServiceImpl implements DiscountService {

	@Autowired
	private DiscountMapper discountMapper;
	@Autowired
	private RedisClient redisClient;
	
	@Override
	public List<Discount> selectAll() {
		//redisClient.set("discountService", "discountService");
		return discountMapper.selectAll();
	}

}
