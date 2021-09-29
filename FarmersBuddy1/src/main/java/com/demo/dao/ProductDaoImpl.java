package com.demo.dao;

import java.sql.ResultSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.demo.bin.Farmer;
import com.demo.bin.Product;

@Repository
public class ProductDaoImpl implements IProductDao{
	SessionFactory sf;
	
	
	public ProductDaoImpl() {
		sf=new Configuration().configure().buildSessionFactory();
	}


	@Override
	public Integer gettime(String crop) {
		Session sess;
		String query="select p.time from Product p where p.pname=:crop";
		 sess=sf.openSession();
			Integer time=(Integer) sess.createQuery(query).setParameter("crop", crop).uniqueResult();
			System.out.println("Extracted time:"+time);
			
			return time;
	}


	@Override
	public Integer getprice(String crop) {
		Session sess;
		String query="select p.expprice from Product p where p.pname=:crop";
		 sess=sf.openSession();
			Integer expprice=(Integer) sess.createQuery(query).setParameter("crop", crop).uniqueResult();
			System.out.println("Extracted price:"+expprice);
			
			return expprice;
	}


	@Override
	public Integer getharvest(String crop) {
		Session sess;
		String query="select p.harvest from Product p where p.pname=:crop";
		 sess=sf.openSession();
			Integer harvest=(Integer) sess.createQuery(query).setParameter("crop", crop).uniqueResult();
			System.out.println("Expected Harvest is:"+harvest);
			
			return harvest;

	}


	@Override
	public void editmsp(String crop,Integer msp) {
		Session sess=null;
		sess=sf.openSession();
		Transaction txn = sess.beginTransaction();
		
		String query="update Product p set p.msp=:msp where p.pname=:crop";
		
		int status=sess.createQuery(query).setParameter("msp",msp).setParameter("crop",crop).executeUpdate();
		txn.commit();
		
	}


	@Override
	public long getcropprediction(String crop) {
		// TODO Auto-generated method stub

		Session sess=null;
		sess=sf.openSession();
		Transaction txn = sess.beginTransaction();
		
//		String query="SELECT SUM(f.LAND*20)-(300) FROM farmers f WHERE f.crop=crop";
//		Farmer f=sess.createQuery(query,Farmer.class).setParameter("Fid",Fid).setParameter("password", password).getSingleResult();
//		
		long totalland = (long) sess.createQuery("SELECT sum(land) from Farmer WHERE crop=:crop").setParameter("crop",crop).getSingleResult();
//		setParameter("crop",crop);
		txn.commit();
		System.out.println("total land ************ "+totalland);
		return totalland;
	}


	private void setParameter(String string, String crop) {
		// TODO Auto-generated method stub
		
	}
	
	
}
