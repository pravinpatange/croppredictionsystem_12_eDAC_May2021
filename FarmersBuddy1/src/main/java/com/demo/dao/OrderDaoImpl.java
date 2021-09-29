package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.demo.bin.Order;
@Repository
public class OrderDaoImpl implements IOrderDao{
	SessionFactory sf;
	
	
	public OrderDaoImpl() {
		super();
		sf=new Configuration().configure().buildSessionFactory();
	}
	
	
	
	@Override
	public String addOrder(Order order) {
		
		System.out.println("In order add dao impl");
		String msg=null;
		Transaction tr=null;
		Session sess=null;
		
		try {
			sess=sf.openSession();
			tr=sess.beginTransaction();
			sess.save(order);
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
	public List<Order> getOrderFarmer(Integer fid) {
		List<Order> olist;
		System.out.println("In get orders for farmer");
		String query="select o from Order o where fid=:fid";
		Session sess=null;
		sess=sf.openSession();
		olist=sess.createQuery(query,Order.class).setParameter("fid", fid).getResultList();
		return olist;
		
		
	}



	@Override
	public void updateStatus(Integer oid) {
		Session sess=null;
		String query="update Order o set o.status=1 where o.oid=:oid";
		sess=sf.openSession();
		sess.createQuery(query,Order.class).setParameter("oid",oid);
		
	}	
		
		
	

}
