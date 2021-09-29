package com.demo.service;

import java.util.List;

import com.demo.bin.Admin;
import com.demo.bin.Product;

public interface IAdminService {
	Admin getAdminProfile(Integer aid);
	
	boolean validateAdmin(Integer aid,String password);
	
	List<Product> getProducts();
	
	String forgotPassword(String email);
	
	boolean admincheck(Integer aid);
}
