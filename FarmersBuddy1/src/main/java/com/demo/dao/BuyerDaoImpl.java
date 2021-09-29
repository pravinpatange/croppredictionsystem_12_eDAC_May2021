package com.demo.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.demo.bin.Buyer;
import com.demo.bin.Farmer;


@Repository
public class BuyerDaoImpl implements IBuyerDao{
	SessionFactory sf;
	
	
	public BuyerDaoImpl() {
		sf=new Configuration().configure().buildSessionFactory();
	}


	@Override
	public String addBuyer(Buyer b) {
		System.out.println("In buyer registration dao impl");
		String msg=null;
		Transaction tr=null;
		Session sess=null;
		try {
			sess=sf.openSession();
			tr=sess.beginTransaction();
			sess.save(b);
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
		System.out.println("In contactcheck of buyers Dao");
		try {
		Transaction tr=null;
		Session sess=null;
		String jpql="select b from Buyer b where b.contact=:contact";
		sess=sf.openSession();
		Buyer f=sess.createQuery(jpql,Buyer.class).setParameter("contact", contact).getSingleResult();
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
		public boolean validateBuyer(Integer Bid, String password) {
		Session sess=null;
		boolean status=false;
		String query="select b from Buyer b where b.password=:password and b.Bid=:Bid";
		try {
		 sess=sf.openSession();
		Buyer b=sess.createQuery(query,Buyer.class).setParameter("Bid",Bid).setParameter("password", password).getSingleResult();
		if(b==null) {
			
			return status;
		}
		status=true;
		return status;
		}catch(NoResultException e) {
			return status;
		}
	}


	@Override
	public Buyer getBuyerProfile(Integer Bid) {
		Buyer b=new Buyer();
		System.out.println("In get buyer profile login");
		
		Session sess=null;
		String jpql="select b from Buyer b where b.Bid=:Bid";
		sess=sf.openSession();
		b=sess.createQuery(jpql,Buyer.class).setParameter("Bid", Bid).getSingleResult();
		System.out.println("Buyer Name:"+b.getBname());
		System.out.println("Buyer Id:"+b.getBid());
		System.out.println("Buyer Lname:"+b.getLname());
		
		return b;
	}


	@Override
	public Buyer getBuyerProfile(String contact) {
		Buyer b=new Buyer();
		System.out.println("In get buyer profile signup");
		
		Session sess=null;
		String jpql="select b from Buyer b where b.contact=:contact";
		sess=sf.openSession();
		b=sess.createQuery(jpql,Buyer.class).setParameter("contact", contact).getSingleResult();
		
		System.out.println("Buyer Name:"+b.getBname());
		System.out.println("Buyer Id:"+b.getBid());
		System.out.println("Buyer Lname:"+b.getLname());
		
		return b;
	}


	@Override
	public List<Buyer> getAllBuyer() {
		
		List<Buyer> blist;
		System.out.println("In all buyer daoimpl");
		String query="select b from Buyer b ";
		Session sess=null;
		sess=sf.openSession();
		blist=sess.createQuery(query,Buyer.class).getResultList();
		return blist;
	}


	@Override
	public boolean deleteBuyer(Integer bid) {
		boolean status=false;
		Session sess=null;
		Transaction tr=null;
		Buyer buyer=new Buyer(bid);
		sess=sf.openSession();
		tr=sess.beginTransaction();
		sess.delete(buyer);
		tr.commit();
		status=true;
		return status;
	}


	@Override
	public String forgotPassword(String email) {
		String pass;
		Buyer buyer=new Buyer();
		System.out.println("In forgotn password dao impl");
		String query="select b from Buyer b where b.email=:email";
		Session sess;
		sess=sf.openSession();
		buyer=sess.createQuery(query,Buyer.class).setParameter("email", email).getSingleResult();
		pass=buyer.getPassword();
		System.out.println("password="+pass);
		return pass;
	}
	
	
	
}


