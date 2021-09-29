package com.demo.service;

public interface IProductService {
	Integer gettime(String crop);
	
	Integer getprice(String crop);
	
	Integer getharvest(String crop);
	
	void editmsp(String crop,Integer msp);
	
	long getland(String crop);
}
