package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bin.Order;
import com.demo.dao.IOrderDao;

@Service
public class OrderServiceImpl implements IOrderService{
	
	@Autowired
	IOrderDao orderDao;
	
	
	@Override
	public String addOrder(Order order) {
		return orderDao.addOrder(order);
	}


	@Override
	public List<Order> getOrderFarmer(Integer fid) {
		return orderDao.getOrderFarmer(fid);
	}


	@Override
	public void updateStatus(Integer oid) {
		orderDao.updateStatus(oid);
		
	}

}
