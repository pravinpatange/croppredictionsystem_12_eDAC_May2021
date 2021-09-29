package com.demo.dao;

import java.util.List;

import com.demo.bin.Farmer;

public interface IFarmerDao {
	boolean validateFarmer(Integer fid,String pass);
	
	String addFarmer(Farmer f);
	
	boolean contactcheck(String contact);
	
	Farmer getFarmerProfile(String contact);
	
	Farmer getFarmerProfile(Integer Fid);
	
	List<Farmer> getFarmerListTown(String townname);
	
	
	List<Farmer> getAllFarmers();
	
	boolean deleteFarmer(Integer fid);
	
	boolean farmerCheck(Integer fid);
	
	Integer getmsp(String crop);
	
	String forgotPassword(String email);
	
	void updateland(Integer fid,Integer land);
}
