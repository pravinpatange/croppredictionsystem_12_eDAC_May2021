package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bin.Buyer;
import com.demo.dao.IBuyerDao;

@Service
public class BuyerServiceImpl implements IBuyerService{
	
	@Autowired
	IBuyerDao buyerDao;
	

	@Override
	public String addBuyer(Buyer b) {
		
		return buyerDao.addBuyer(b);
		
	}


	@Override
	public boolean contactcheck(String contact) {
		return buyerDao.contactcheck(contact);
	}


	@Override
	public boolean validateBuyer(Integer Bid, String password) {
		return buyerDao.validateBuyer(Bid,password);
	}


	@Override
	public Buyer getBuyerProfile(Integer Bid) {
		return buyerDao.getBuyerProfile(Bid);
	}


	@Override
	public Buyer getBuyerProfile(String contact) {
		return buyerDao.getBuyerProfile(contact);
	}


	@Override
	public List<Buyer> getAllBuyer() {
		return buyerDao.getAllBuyer();
	}


	@Override
	public boolean deleteBuyer(Integer bid) {
		return buyerDao.deleteBuyer(bid);
	}


	@Override
	public String forgotPassword(String email) {
		return buyerDao.forgotPassword(email);
	}


	
	
}
