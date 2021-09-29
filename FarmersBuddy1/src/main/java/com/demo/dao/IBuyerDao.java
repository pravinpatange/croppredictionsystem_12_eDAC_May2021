package com.demo.dao;

import java.util.List;

import com.demo.bin.Buyer;

public interface IBuyerDao {

	
	String addBuyer(Buyer b);
	
	boolean contactcheck(String contact);
	
	boolean validateBuyer(Integer Bid,String password);
	
	Buyer getBuyerProfile(Integer Bid);
	
	Buyer getBuyerProfile(String contact);
	
	List<Buyer> getAllBuyer();
	
	boolean deleteBuyer(Integer bid);
	
	String forgotPassword(String email);
}
