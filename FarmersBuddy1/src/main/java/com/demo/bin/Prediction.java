package com.demo.bin;

import org.springframework.stereotype.Controller;

@Controller
public class Prediction {
	private Integer time;
	private Integer price;
	private Integer harvest;
	private Integer expharvest;
	private long total;
	public Prediction() {
		super();
	}
	public Prediction(Integer time, Integer price, Integer harvest, Integer expharvest, long total) {
		super();
		this.time = time;
		this.price = price;
		this.harvest = harvest;
		this.expharvest = expharvest;
		this.total = total;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getHarvest() {
		return harvest;
	}
	public void setHarvest(Integer harvest) {
		this.harvest = harvest;
	}
	public Integer getExpharvest() {
		return expharvest;
	}
	public void setExpharvest(Integer expharvest) {
		this.expharvest = expharvest;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Prediction [time=" + time + ", price=" + price + ", harvest=" + harvest + ", expharvest=" + expharvest
				+ ", total=" + total + "]";
	}
	

	

}
