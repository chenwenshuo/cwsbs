package com.cws.service;

import java.util.List;

import com.cws.entity.Discount;

public interface DiscountService {

	/**
	 * 查询所有的优惠券信息
	 * @return
	 */
	List<Discount> selectAll();
}
