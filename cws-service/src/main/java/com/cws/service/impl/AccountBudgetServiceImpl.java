package com.cws.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cws.entity.AccountBudget;
import com.cws.mapper.AccountBudgetMapper;
import com.cws.service.AccountBudgetService;
import com.cws.service.RedisClient;

@Service
@Transactional
public class AccountBudgetServiceImpl implements AccountBudgetService {

	@Autowired
	AccountBudgetMapper accountBudgetMapper;
	@Autowired
	private RedisClient redisClient;
	
	@Override
	public AccountBudget setBudget(Integer year, Integer month, Integer userId,Integer money) {
		AccountBudget budget = selectBudget(year, month, userId);
		if (budget != null) {
			budget.setUpdateTime(new Date());
			budget.setBudgetMoney(money*100);
			accountBudgetMapper.updateByPrimaryKey(budget);
		} else {
			budget = new AccountBudget();
			budget.setBudgetYear(year);
			budget.setBudgetMonth(month);
			budget.setBudgetMoney(money*100);
			budget.setCreateTime(new Date());
			budget.setUserId(userId);
			budget.setUpdateTime(new Date());
			accountBudgetMapper.insert(budget);
		}
		String totalKey = "totalkey"+userId+year+month;
		redisClient.del(totalKey);
		return budget;
	}

	@Override
	public AccountBudget selectBudget(Integer year, Integer month, Integer userId) {
		return accountBudgetMapper.selectBudget(year, month, userId);
	}

}
