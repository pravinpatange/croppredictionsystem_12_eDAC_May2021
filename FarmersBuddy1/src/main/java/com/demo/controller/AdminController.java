package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bin.Admin;
import com.demo.bin.Product;
import com.demo.service.IAdminService;

@Controller
public class AdminController {
	
	@Autowired
	IAdminService adminservice;
	
	@Autowired
	private MailSender mailSender;
	
	@RequestMapping(value="validateadmin",method=RequestMethod.POST)
	public ModelAndView validateAdmin(@RequestParam("uname") Integer aid,@RequestParam("pass") String password ) {
System.out.println("In farmer login");
		
		boolean status=false;
		String message;
		status =adminservice.validateAdmin(aid,password);
		
		if(status==true) {
			message="Success";
			Admin admin=adminservice.getAdminProfile(aid);
			return new ModelAndView("admin-profile","admin",admin);
			
		}
		message="Failed";
		return new ModelAndView("displayMessage","msg",message);
		
	}
	
	
	
	
	@RequestMapping(value="show-products")
	public ModelAndView getProducts() {
		
		List<Product> plist=adminservice.getProducts();
		 return new ModelAndView("all-products","plist",plist);
	}
	
	@RequestMapping(value = "admin-forgot-password",method = RequestMethod.POST)
	public ModelAndView forgotPassword(@RequestParam String email) {
		String pass = adminservice.forgotPassword(email);
		String msg = "you are not registered";
		if(pass!=null) {	
		
			SimpleMailMessage message = new SimpleMailMessage();  
	        message.setFrom("FarmerBuddyofficialinc@gmail.com");  
	        message.setTo(email);  
	        message.setSubject("Hello Farmer from Farmer buddy  Your password is");  
	        message.setText(pass);  
	         
	        mailSender.send(message);
			msg = "Please check the mail for password";
		}
		return new ModelAndView("displayMessage","msg",msg);
	}	
	
}

