package com.demo.bin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oid;
	private Integer fid;
	private String crop;
	private Integer bid;
	private Integer status;
	private Integer amount;
	private Integer price;
	
	public Order() {
		super();
	}

	public Order(Integer oid, Integer fid, String crop, Integer bid, Integer status, Integer amount, Integer price) {
		super();
		this.oid = oid;
		this.fid = fid;
		this.crop = crop;
		this.bid = bid;
		this.status = status;
		this.amount = amount;
		this.price = price;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}




	public Integer getOid() {
		return oid;
	}


	public void setOid(Integer oid) {
		this.oid = oid;
	}


	public Integer getFid() {
		return fid;
	}


	public void setFid(Integer fid) {
		this.fid = fid;
	}


	public String getCrop() {
		return crop;
	}


	public void setCrop(String crop) {
		this.crop = crop;
	}


	public Integer getBid() {
		return bid;
	}


	public void setBid(Integer bid) {
		this.bid = bid;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public Integer getAmount() {
		return amount;
	}


	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", fid=" + fid + ", crop=" + crop + ", bid=" + bid + ", status=" + status
				+ ", amount=" + amount + ", price=" + price + "]";
	}


	
	
}
