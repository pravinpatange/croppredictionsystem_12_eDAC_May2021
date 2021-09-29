package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bin.Order;
import com.demo.service.IOrderService;

@Controller
public class OrderController {
	@Autowired
	IOrderService orderService;

	@RequestMapping("addorder/{oid}/{fid}/{crop}/{bid}/{status}/{amount}/{price}")
	public ModelAndView addOrder(@PathVariable("oid") Integer oid, @PathVariable("fid") Integer fid,
			@PathVariable("crop") String crop, @PathVariable("bid") Integer bid, @PathVariable("status") Integer status,
			@PathVariable("amount") Integer amount, @PathVariable("price") Integer price) {
		System.out.println("Oid:" + price);
		String msg;
		Order order = new Order(oid, fid, crop, bid, status, amount, price);
		msg = orderService.addOrder(order);
		if (msg == "success") {
			String message = "Order Added Successfully";
			return new ModelAndView("displayMessage", "msg", message);
		}
		msg = "Order is not addes successfully";
		return new ModelAndView("displayMessage", "msg", msg);
	}

	@RequestMapping("show-orders-farmer/{fid}")
	public ModelAndView getOrderForFarmer(@PathVariable("fid") Integer fid) {
		List<Order> order = orderService.getOrderFarmer(fid);
		return new ModelAndView("order-for-farmer", "order", order);

	}

	@RequestMapping("confirm/{oid}")
	public ModelAndView confirmByFarmer(@PathVariable("oid") Integer oid) {
		orderService.updateStatus(oid);
		String message = "Order is Confirmed";
		return new ModelAndView("displayMessage", "msg", message);
	}

}
