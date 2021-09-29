package com.demo.service;

import java.util.List;

import com.demo.bin.Order;

public interface IOrderService {
	String addOrder(Order order);
	
	List<Order> getOrderFarmer(Integer fid);
	
	void updateStatus(Integer oid);
}
