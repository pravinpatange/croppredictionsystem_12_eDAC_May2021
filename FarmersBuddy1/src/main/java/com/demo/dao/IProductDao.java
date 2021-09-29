package com.demo.dao;




public interface IProductDao {
	
	
	Integer gettime(String crop);
	
	Integer getprice(String crop);
	
	Integer getharvest(String crop);
	
	long getcropprediction(String crop);
	
	void editmsp(String crop,Integer msp);
}
