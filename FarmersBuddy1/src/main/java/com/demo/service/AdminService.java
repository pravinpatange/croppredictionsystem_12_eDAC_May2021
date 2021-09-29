package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bin.Admin;
import com.demo.bin.Product;
import com.demo.dao.IAdminDao;

@Service
public class AdminService implements IAdminService{
	
	
	@Autowired
	IAdminDao adminDao;
	@Override
	public Admin getAdminProfile(Integer aid) {
		return adminDao.getAdminProfile(aid);
	}

	@Override
	public boolean validateAdmin(Integer aid, String password) {
		return adminDao.validateAdmin(aid,password);
	}

	@Override
	public List<Product> getProducts() {
		return adminDao.getProducts();
	}

	@Override
	public String forgotPassword(String email) {
		return adminDao.forgotPassword(email);
	}

	@Override
	public boolean admincheck(Integer aid) {
		return adminDao.admincheck(aid);
	}
	
}
