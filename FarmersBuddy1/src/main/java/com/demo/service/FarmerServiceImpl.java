package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bin.Farmer;
import com.demo.dao.IFarmerDao;

@Service
public class FarmerServiceImpl implements IFarmerService{
	
	@Autowired
	IFarmerDao farmerDao;
	
	
	@Override
	public boolean validateFarmer(Integer fid,String pass) {
		return farmerDao.validateFarmer(fid,pass);
	}
	
	
	@Override
	public String addFarmer(Farmer f) {
		System.out.println("In farmer registration service");
		return farmerDao.addFarmer(f);
	}


	@Override
	public boolean contactcheck(String contact) {
		return farmerDao.contactcheck(contact);
	}


	@Override
	public Farmer getFarmerProfile(String contact) {
		return farmerDao.getFarmerProfile(contact);
	}


	@Override
	public Farmer getFarmerProfile(Integer Fid) {
		
		return farmerDao.getFarmerProfile(Fid);
	}


	@Override
	public List<Farmer> getFarmerListTown(String townname) {
		return farmerDao.getFarmerListTown(townname);
	}


	@Override
	public List<Farmer> getAllFarmers() {
		System.out.println("In all farmer service");
		return farmerDao.getAllFarmers();
	}


	@Override
	public boolean deleteFarmer(Integer fid) {
		return farmerDao.deleteFarmer(fid);
	}


	@Override
	public boolean farmerCheck(Integer fid) {
		return farmerDao.farmerCheck(fid);
	}


	@Override
	public Integer getmsp(String crop) {
		return farmerDao.getmsp(crop);
	}


	@Override
	public String forgotPassword(String email) {
		return farmerDao.forgotPassword(email);
	}


	@Override
	public void updateland(Integer fid, Integer land) {
		 farmerDao.updateland(fid,land);
		
	}
}
