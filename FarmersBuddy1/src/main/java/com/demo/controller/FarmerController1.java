package com.demo.controller;

import java.lang.annotation.Repeatable;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bin.Farmer;
import com.demo.bin.Order;
import com.demo.service.IFarmerService;

@Controller
public class FarmerController1 {

	@Autowired
	IFarmerService farmerService;

	@Autowired
	private MailSender mailSender;

	@RequestMapping(value = "validatefarmer", method = RequestMethod.POST)
	public String loginFarmer(@RequestParam("uname") Integer fid, @RequestParam("pass") String password,
			HttpSession session) {
		System.out.println("In farmer login");

		boolean status = false;
		String message;
		status = farmerService.validateFarmer(fid, password);

		if (status == true) {
			message = "Success";
			Farmer farmer = farmerService.getFarmerProfile(fid);
			session.setAttribute("farmer", farmer);
			return "farmer-profile";
		}
		message = "Failed";
		return message;
	}

	@RequestMapping(value = "farmersignup", method = RequestMethod.POST)
	public ModelAndView signupFarmer(@RequestParam("fname") String Fname, @RequestParam("lname") String Lname,
			@RequestParam("crop") String Crop, @RequestParam("Water Source") String Wsource,
			@RequestParam("Town Name") String Tname, @RequestParam("firstpass") String Fpass,
			@RequestParam("secondpass") String Spass, @RequestParam("land") Integer Land,
			@RequestParam("contact") String contact, @RequestParam("repocrop") String repocrop,
			@RequestParam("repoamount") Integer repoamount, @RequestParam("email") String email) {
		System.out.println("In farmer registration");
		Integer fid = 0;
		String status = null;
		boolean accountcheck = false;
		accountcheck = farmerService.contactcheck(contact);
		if (accountcheck) {
			status = "The farmer already has account with this number";
			return new ModelAndView("displayMessage", "msg", status);
		} else {
			Farmer f = new Farmer(Fname, Lname, Land, Crop, fid, Fpass, Wsource, Tname, contact, repocrop, repoamount,
					email);

			status = farmerService.addFarmer(f);
			Farmer farmer = farmerService.getFarmerProfile(contact);
			return new ModelAndView("farmer-profile", "farmer", farmer);
		}

	}

	@RequestMapping("show-other-farmer/{townname}/{Fid}")
	public ModelAndView getListOfTownFarmers(@PathVariable("townname") String townname,
			@PathVariable("Fid") Integer fid) {

		List<Farmer> flist = farmerService.getFarmerListTown(townname);

		return new ModelAndView("same-town-farmers", "flist", flist);

	}

	@RequestMapping("/show-farmer-list") // show-farmer-list//farmers

	public ModelAndView getAllFarmers() {
		System.out.println("In all farmer controller");
		List<Farmer> allFarmers = farmerService.getAllFarmers();
		return new ModelAndView("all-farmer", "flist", allFarmers);

	}

	@RequestMapping("show-farmer-list-for-admin")
	public ModelAndView getAllFarmersForAdmin() {
		System.out.println("In all farmer controller for admin");
		List<Farmer> allFarmers = farmerService.getAllFarmers();
		return new ModelAndView("all-farmer-for-admin", "flist", allFarmers);

	}

	@RequestMapping("delete-farmer/{Fid}")
	public ModelAndView deleteFarmer(@PathVariable("Fid") Integer fid) {
		boolean status = false;
		if (status == false) {
			status = farmerService.deleteFarmer(fid);
			return new ModelAndView("farmer-deleted");
		} else {
			return new ModelAndView("farmer-not-deleted");
		}
	}

	@RequestMapping(value = "orderprocess", method = RequestMethod.POST)
	public ModelAndView orderProcess(@RequestParam("repocrop") String crop, @RequestParam("amount") Integer amount,
			@RequestParam("fid") Integer fid, @RequestParam("bid") Integer bid) {
		System.out.println("In ordrer process");
		Integer msp;

		boolean farmercheck = farmerService.farmerCheck(fid);
		if (farmercheck) {
			// Integer price;
			Integer status = 0;
			msp = farmerService.getmsp(crop);
			Integer price = msp * amount;
			Integer oid = 0;
			Order order = new Order(oid, fid, crop, bid, status, amount, price);
			System.out.println("Oid:" + oid);
			System.out.println("Fid:" + fid);
			return new ModelAndView("confirm-order", "order", order);
		}
		return new ModelAndView("farmer-not-found");
	}

	@RequestMapping(value = "forgot-password", method = RequestMethod.POST)
	public ModelAndView forgotPassword(@RequestParam String email) {
		String pass = farmerService.forgotPassword(email);
		String msg = "you are not registered";
		if (pass != null) {

			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom("FarmerBuddyofficialinc@gmail.com");
			message.setTo(email);
			message.setSubject("Hello Farmer from Farmer buddy  Your password is");
			message.setText(pass);

			mailSender.send(message);
			msg = "Please check the mail for password";
		}
		return new ModelAndView("displayMessage", "msg", msg);
	}

	@RequestMapping(value = "update-land", method = RequestMethod.POST)
	public ModelAndView updateland(@RequestParam("fid") Integer fid, @RequestParam("land") Integer land) {
		boolean status = false;
		status = farmerService.farmerCheck(fid);
		if (status) {
			farmerService.updateland(fid, land);
			String message = "land is updated";
			return new ModelAndView("displayMessage", "msg", message);
		}
		String msg = "This farmer is not found";
		return new ModelAndView("displayMessage", "msg", msg);
	}

}
