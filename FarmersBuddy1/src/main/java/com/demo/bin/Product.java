package com.demo.bin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
	
	private String pname;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	private Integer harvest;
	private Integer time;
	private Integer msp;
	private Integer expprice;
	
	
	public Product() {
		super();
	}




	public Integer getMsp() {
		return msp;
	}




	public void setMsp(Integer msp) {
		this.msp = msp;
	}




	public Integer getExpprice() {
		return expprice;
	}




	public void setExpprice(Integer expprice) {
		this.expprice = expprice;
	}




	public Product(String pname, Integer pid, Integer harvest, Integer time, Integer msp, Integer expprice) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.harvest = harvest;
		this.time = time;
		this.msp = msp;
		this.expprice = expprice;
	}




	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public Integer getHarvest() {
		return harvest;
	}


	public void setHarvest(Integer harvest) {
		this.harvest = harvest;
	}


	public Integer getTime() {
		return time;
	}


	public void setTime(Integer time) {
		this.time = time;
	}




	@Override
	public String toString() {
		return "Product [pname=" + pname + ", pid=" + pid + ", harvest=" + harvest + ", time=" + time + ", msp=" + msp
				+ ", expprice=" + expprice + "]";
	}


	
	
	
	
	
}
