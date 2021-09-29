package com.demo.bin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admins")
public class Admin {
	private String FName;
	private String LName;
	private String password;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Aid;
	private String email;
	
	public Admin() {
		super();
	}


	public Admin(String fName, String lName, String password, Integer aid,String email) {
		super();
		FName = fName;
		LName = lName;
		this.password = password;
		Aid = aid;
		this.email=email;
	}


	public String getFName() {
		return FName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setFName(String fName) {
		FName = fName;
	}


	public String getLName() {
		return LName;
	}


	public void setLName(String lName) {
		LName = lName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getAid() {
		return Aid;
	}


	public void setAid(Integer aid) {
		Aid = aid;
	}


	@Override
	public String toString() {
		return "Admin [FName=" + FName + ", LName=" + LName + ", password=" + password + ", Aid=" + Aid + ", email="
				+ email + "]";
	}


	
	
	
}
