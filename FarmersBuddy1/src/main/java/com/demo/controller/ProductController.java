package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bin.Prediction;
import com.demo.service.IAdminService;
import com.demo.service.IProductService;

@Controller
public class ProductController {

	@Autowired
	IProductService productService;
	@Autowired
	IAdminService adminService;

	@RequestMapping("show-crop-predictions/{crop}/{fid}/{land}")
	public ModelAndView showPrediction(@PathVariable("crop") String crop, @PathVariable("fid") Integer fid,
			@PathVariable("land") Integer land) {
		Integer time = productService.gettime(crop);
		Integer price = productService.getprice(crop);
		Integer harvest = productService.getharvest(crop);
		Integer expharvest = harvest * land;
		long total = productService.getland(crop);
//		Integer land =productService
		System.out.println("Expected Harvest is :" + harvest);
		System.out.println("Expected total Harvest is :" + expharvest);
		System.out.println("land :" + land);
		System.out.println("Expected time is :" + time);
		System.out.println("Expected price is :" + price);
		System.out.println(" totlal land :" + total * expharvest);
		/*
		 * List<Integer> predlist=new ArrayList<Integer>(); predlist.add(time);
		 * predlist.add(price); predlist.add(harvest); predlist.add(expharvest);
		 */
		Prediction pred = new Prediction(time, price, harvest, expharvest, total);
		return new ModelAndView("show-harvest-time", "predlist", pred);

	}

	@RequestMapping(value = "edit-msp", method = RequestMethod.POST)
	public ModelAndView editMSP(@RequestParam("aid") Integer aid, @RequestParam("crop") String crop,
			@RequestParam("msp") Integer msp) {
		boolean status = false;
		status = adminService.admincheck(aid);
		if (status) {
			productService.editmsp(crop, msp);
			String msg = "MSP updated";
			return new ModelAndView("displayMessage", "msg", msg);
		}
		String msg = "Admin not registered";
		return new ModelAndView("displayMessage", "msg", msg);
	}
}
