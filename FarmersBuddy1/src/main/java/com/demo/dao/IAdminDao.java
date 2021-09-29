package com.demo.dao;

import java.util.List;

import com.demo.bin.Admin;
import com.demo.bin.Product;

public interface IAdminDao {
	boolean validateAdmin(Integer aid,String password);
	
	Admin getAdminProfile(Integer aid);
	
	List<Product> getProducts();
	
	String forgotPassword(String email);
	
	boolean admincheck(Integer aid);
}
