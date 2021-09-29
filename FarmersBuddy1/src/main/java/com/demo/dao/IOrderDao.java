package com.demo.dao;

import java.util.List;

import com.demo.bin.Order;

public interface IOrderDao {
	String addOrder(Order order);
	
	List<Order> getOrderFarmer(Integer fid);
	
	void updateStatus(Integer oid);
}
