package com.demo.dao;

import java.util.List;
import javax.persistence.NoResultException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.demo.bin.Admin;
import com.demo.bin.Farmer;
import com.demo.bin.Product;

@Repository
public class AdminDaoImpl implements IAdminDao{
	SessionFactory sf;
	
	
	
	public AdminDaoImpl() {
		sf=new Configuration().configure().buildSessionFactory();
	}



	@Override
	public boolean validateAdmin(Integer aid, String password) {
		Session sess=null;
		boolean status=false;
		String query="select a from Admin a where a.password=:password and a.Aid=:Aid";
		try {
		 sess=sf.openSession();
		Admin a=sess.createQuery(query,Admin.class).setParameter("Aid",aid).setParameter("password", password).getSingleResult();
		if(a==null) {
			
			return status;
		}
		status=true;
		return status;
		}catch(NoResultException e) {
			return status;
		}
		
		
	}



	@Override
	public Admin getAdminProfile(Integer aid) {
		Admin a=new Admin();
		System.out.println("In get admin profile login");
		
		Session sess=null;
		String jpql="select a from Admin a where a.Aid=:Aid";
		sess=sf.openSession();
		a=sess.createQuery(jpql,Admin.class).setParameter("Aid", aid).getSingleResult();
		System.out.println("Admin Name:"+a.getFName());
		return a;
	}



	@Override
	public List<Product> getProducts() {
		List<Product> plist;
		
		System.out.println("In all product daoimpl");
		String query="select p from Product p ";
		Session sess=null;
		sess=sf.openSession();
		plist=sess.createQuery(query,Product.class).getResultList();
		return plist;
	}



	@Override
	public String forgotPassword(String email) {
		String pass;
		Admin admin=new Admin();
		System.out.println("In forgotn password dao impl");
		String query="select a from Admin a where a.email=:email";
		Session sess;
		sess=sf.openSession();
		admin=sess.createQuery(query,Admin.class).setParameter("email", email).getSingleResult();
		pass=admin.getPassword();
		System.out.println("password="+pass);
		return pass;
	}



	@Override
	public boolean admincheck(Integer aid) {
		boolean status=false;
		Admin admin=new Admin();
		System.out.println("In admincheck");
		String query="select a from Admin a where a.Aid=:aid";
		Session sess;
		sess=sf.openSession();
		admin=sess.createQuery(query,Admin.class).setParameter("aid", aid).getSingleResult();
		System.out.println("Admins Name:"+admin.getFName());
		if(admin.getAid()==aid) {
			status=true;
			return status;
		}
		return status;
	}
	
	

}
