package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bin.Buyer;
import com.demo.bin.Farmer;
import com.demo.service.IBuyerService;

@Controller
public class BuyerController {
	@Autowired
	IBuyerService buyerService;
	
	@Autowired
	private MailSender mailSender;
	@RequestMapping(value= "buyerssignup" ,method=RequestMethod.POST)
	public ModelAndView SignupBuyer(@RequestParam("fname") String Fname,
			@RequestParam("lname") String Lname,
			@RequestParam("firstpass") String Fpass,
			@RequestParam("secondpass") String Spass,
			@RequestParam("contact") String contact,
			@RequestParam("email") String email) {
		System.out.println("In Buyerscontroller");
		Integer bid=0;
		String status=null;
		boolean accountcheck=false;
		accountcheck=buyerService.contactcheck(contact);
		if(accountcheck) {
			status="The Buyer already has account";
			return new ModelAndView("displayMessage","msg",status);
		}
		else {
			Buyer b=new Buyer(Fname,Lname,Fpass,bid,contact,email);
			status=buyerService.addBuyer(b);
			Buyer buyer = buyerService.getBuyerProfile(contact);
			return new ModelAndView("buyer-profile","buyer",buyer);
		}
		
		
		
	}
	
	@RequestMapping(value = "validatebuyer",method = RequestMethod.POST)
	public ModelAndView loginBuyer(@RequestParam("uname") Integer bid,@RequestParam("pass") String password) {
		System.out.println("In buyer login");
		
		boolean status=false;
		String message;
		status =buyerService.validateBuyer(bid,password);
		
		if(status==true) {
			message ="success";
			Buyer buyer = buyerService.getBuyerProfile(bid);
			return new ModelAndView("buyer-profile","buyer",buyer);
			
		}
		message="Failed";
		return new ModelAndView("displayMessage","msg",message);
		
	}
	
	@RequestMapping("all-buyers")
	public ModelAndView getAllBuyersForAdmin() {
		System.out.println("In all buyers controller for admin");
		List<Buyer> blist=buyerService.getAllBuyer();
		return new ModelAndView("all-buyer","blist",blist);
		
	}
	
	@RequestMapping("delete-buyer/{bid}")
	public ModelAndView deleteFarmer(@PathVariable("bid") Integer bid) {
		boolean status=false;
		if(status==false) {
		status=buyerService.deleteBuyer(bid);
		return new ModelAndView("farmer-deleted");
		}else {
			return new ModelAndView("farmer-not-deleted");
		}
	}
	
	@RequestMapping(value = "buyer-forgot-password",method = RequestMethod.POST)
	public ModelAndView forgotPassword(@RequestParam String email) {		
		String pass = buyerService.forgotPassword(email);
		String msg = "you are not registered";
		if(pass!=null) {	
			
			SimpleMailMessage message = new SimpleMailMessage();  
	        message.setFrom("FarmerBuddyofficialinc@gmail.com");  
	        message.setTo(email);  
	        message.setSubject("Hello Buyer from Farmer buddy  Your password is");  
	        message.setText(pass);  
	         
	        mailSender.send(message);
			msg = "Please check the mail for password";
		}
		return new ModelAndView("displayMessage","msg",msg);
	}	
}
