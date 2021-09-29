package com.demo.dao;



import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.demo.bin.Farmer;
import com.demo.bin.Order;
import com.demo.bin.Product;

@Repository
public class FarmerDaoImpl implements IFarmerDao{
	SessionFactory sf;
	
	public FarmerDaoImpl() {
		sf=new Configuration().configure().buildSessionFactory();
	}

	@Override
	public boolean validateFarmer(Integer Fid,String password){
		
		Session sess=null;
		boolean status=false;
		String query="select f from Farmer f where f.password=:password and f.Fid=:Fid";
		try {
		 sess=sf.openSession();
		Farmer f=sess.createQuery(query,Farmer.class).setParameter("Fid",Fid).setParameter("password", password).getSingleResult();
		if(f==null) {
			
			return status;
		}
		status=true;
		return status;
		}catch(NoResultException e) {
			return status;
		}
	}
	
	
	@Override
	public String addFarmer(Farmer f) {
		System.out.println("In farmer registration dao impl");
		String msg=null;
		Transaction tr=null;
		Session sess=null;
		try {
			sess=sf.openSession();
			tr=sess.beginTransaction();
			sess.save(f);
			tr.commit();
			msg="success";
			
		}catch(Exception e) {
			
			tr.rollback();
			return e.getMessage();
		}
		sess.close();
		return msg;
	}

	@Override
	public boolean contactcheck(String contact) {
		boolean status=false;
		System.out.println("In contactcheck");
		try {
		
		Session sess=null;
		String jpql="select f from Farmer f where f.contact=:contact";
		sess=sf.openSession();
		Farmer f=sess.createQuery(jpql,Farmer.class).setParameter("contact", contact).getSingleResult();
		if(f!=null) {
			status=true;
			return status;
		}
		return status;
		}catch(NoResultException e) {
			status=false;
			return status;
		}
		
	}

	@Override
	public Farmer getFarmerProfile(String contact) {
		Farmer f=new Farmer();
		System.out.println("In contactcheck");
		
		
		Session sess=null;
		String jpql="select f from Farmer f where f.contact=:contact";
		sess=sf.openSession();
		f=sess.createQuery(jpql,Farmer.class).setParameter("contact", contact).getSingleResult();
		System.out.println("Farmer Name:"+f.getFName());
		return f;
	
	}

	@Override
	public Farmer getFarmerProfile(Integer Fid) {
		Farmer f=new Farmer();
		System.out.println("In get farmer profile login");
		
		Session sess=null;
		String jpql="select f from Farmer f where f.Fid=:Fid";
		sess=sf.openSession();
		f=sess.createQuery(jpql,Farmer.class).setParameter("Fid", Fid).getSingleResult();
		System.out.println("Farmer Name:"+f.getFName());
		return f;
	}

	@Override
	public List<Farmer> getFarmerListTown(String townname) {
		List<Farmer> flist;
		System.out.println("In get farmer list from same town");
		String query="select f from Farmer f where townname=:townname";
		Session sess=null;
		sess=sf.openSession();
		flist=sess.createQuery(query,Farmer.class).setParameter("townname", townname).getResultList();
		return flist;
		
	}

	@Override
	public List<Farmer> getAllFarmers() {
		
		List<Farmer> flist;
		System.out.println("In all farmer daoimpl");
		String query="select f from Farmer f ";
		Session sess=null;
		sess=sf.openSession();
		flist=sess.createQuery(query,Farmer.class).getResultList();
		return flist;
	}

	@Override
	public boolean deleteFarmer(Integer fid) {
		boolean status=false;
		Session sess=null;
		Transaction tr=null;
		Farmer farmer=new Farmer(fid);
		sess=sf.openSession();
		tr=sess.beginTransaction();
		sess.delete(farmer);
		tr.commit();
		status=true;
		return status;
		
		
	}

	@Override
	public boolean farmerCheck(Integer fid) {
		boolean status=false;
		Farmer f=new Farmer();
		System.out.println("In farmercheck");
		
		
		Session sess=null;
		String jpql="select f from Farmer f where f.Fid=:fid";
		sess=sf.openSession();
		f=sess.createQuery(jpql,Farmer.class).setParameter("fid",fid).getSingleResult();
		System.out.println("Farmer Name:"+f.getFName());
		if(f.getFid()==fid) {
			status=true;
			return status;
		}
		return status;
	}

	@Override
	public Integer getmsp(String crop) {
		Integer msp;
		Product p=new Product();
		System.out.println("In getmsp");
		String query="select p from Product p where p.pname=:crop";
		Session sess;
		sess=sf.openSession();
		p=sess.createQuery(query,Product.class).setParameter("crop",crop).getSingleResult();
		msp=p.getMsp();
		return msp;
	}

	@Override
	public String forgotPassword(String email) {
		String pass;
		Farmer farmer=new Farmer();
		System.out.println("In forgotn password dao impl");
		String query="select f from Farmer f where f.email=:email";
		Session sess;
		sess=sf.openSession();
		farmer=sess.createQuery(query,Farmer.class).setParameter("email", email).getSingleResult();
		pass=farmer.getPassword();
		System.out.println("password="+pass);
		return pass;
	}

	@Override
	public void updateland(Integer fid, Integer land) {
		Session sess=null;
		sess=sf.openSession();
		Transaction txn = sess.beginTransaction();
		
		String query="update Farmer f set f.land=:land where f.Fid=:fid";
		
		int status=sess.createQuery(query).setParameter("fid",fid).setParameter("land",land).executeUpdate();
		txn.commit();
		
	}
		
}
