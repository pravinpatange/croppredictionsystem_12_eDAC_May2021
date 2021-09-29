package com.demo.bin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Buyers")
public class Buyer {
	private String Bname;
	private String Lname;
	private String password;
	private String contact;
	
	public Buyer(Integer bid) {
		super();
		Bid = bid;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Bid;
	private String email;
	
	public Buyer() {
		super();
	}

	public Buyer(String fname, String lname, String password, Integer bid,String contact,String email) {
		super();
		Bname = fname;
		Lname = lname;
		this.password = password;
		Bid = bid;
		this.contact=contact;
		this.email=email;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getBname() {
		return Bname;
	}


	public void setBname(String bname) {
		Bname = bname;
	}


	public String getLname() {
		return Lname;
	}


	public void setLname(String lname) {
		Lname = lname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getBid() {
		return Bid;
	}


	public void setBid(Integer bid) {
		Bid = bid;
	}

	@Override
	public String toString() {
		return "Buyer [Bname=" + Bname + ", Lname=" + Lname + ", password=" + password + ", contact=" + contact
				+ ", Bid=" + Bid + ", email=" + email + "]";
	}

		

	


	
	
	
}
