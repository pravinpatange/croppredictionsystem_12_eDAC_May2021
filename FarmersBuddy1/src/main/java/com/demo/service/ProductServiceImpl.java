package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.IProductDao;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	IProductDao productDao;
	
	
	@Override
	public Integer gettime(String crop) {
		return productDao.gettime(crop);
	}


	@Override
	public Integer getprice(String crop) {
		return productDao.getprice(crop);
	}


	@Override
	public Integer getharvest(String crop) {
		return productDao.getharvest(crop);
	}


	@Override
	public void editmsp(String crop,Integer msp) {
		productDao.editmsp(crop,msp);
		
	}


	@Override
	public long getland(String crop) {
		
		return productDao.getcropprediction(crop);
	}


	
	
	
	
}
