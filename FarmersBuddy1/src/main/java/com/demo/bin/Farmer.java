package com.demo.bin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Farmers")
public class Farmer {
		private String FName;
		private String LName;
		private Integer land;
		private String crop;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer Fid;
		private String password;
		private String watersrc;
		private String townname;
		private String contact;
		private String repocrop;
		private Integer repo;
		private String email;
//		private int land*
		
		
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Farmer(Integer fid) {
			super();
			Fid = fid;
		}

		public String getRepocrop() {
			return repocrop;
		}

		public void setRepocrop(String repocrop) {
			this.repocrop = repocrop;
		}

		public Integer getRepo() {
			return repo;
		}

		public void setRepo(Integer repo) {
			this.repo = repo;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public Farmer() {
			super();
		}

		
		

		

		public Farmer(String fName, String lName, Integer land, String crop, Integer fid, String password,
				String watersrc, String townname, String contact, String repocrop, Integer repo, String email) {
			super();
			FName = fName;
			LName = lName;
			this.land = land;
			this.crop = crop;
			Fid = fid;
			this.password = password;
			this.watersrc = watersrc;
			this.townname = townname;
			this.contact = contact;
			this.repocrop = repocrop;
			this.repo = repo;
			this.email = email;
		}

		public String getFName() {
			return FName;
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


		public Integer getLand() {
			return land;
		}


		




		public void setLand(Integer land) {
			this.land = land;
		}


		public String getCrop() {
			return crop;
		}


		public void setCrop(String crop) {
			this.crop = crop;
		}

		
		public Integer getFid() {
			return Fid;
		}


		public void setFid(Integer fid) {
			Fid = fid;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getWatersrc() {
			return watersrc;
		}


		public void setWatersrc(String watersrc) {
			this.watersrc = watersrc;
		}


		public String getTownname() {
			return townname;
		}


		public void setTownname(String townname) {
			this.townname = townname;
		}

		@Override
		public String toString() {
			return "Farmer [FName=" + FName + ", LName=" + LName + ", land=" + land + ", crop=" + crop + ", Fid=" + Fid
					+ ", password=" + password + ", watersrc=" + watersrc + ", townname=" + townname + ", contact="
					+ contact + ", repocrop=" + repocrop + ", repo=" + repo + ", email=" + email + "]";
		}


		
		
		

		
}
