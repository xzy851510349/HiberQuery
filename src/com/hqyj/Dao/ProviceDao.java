package com.hqyj.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hqyj.Bean.Provice;
import com.hqyj.Text.hibernateUnil;

public class ProviceDao {
	Session session = hibernateUnil.getCurrectSession();
	public void AddProviceDao(Provice provice){
		session.save(provice);
	}
	
	
	
	
	public Provice queryName(String name){
		Query query  =  session.createQuery("from provice where name=?");
		query.setString(0, name);
		List<Provice> list = query.list();
		Provice p = null;
		if (list.size()>0) {
			p = list.get(0);
		}
		
		return p;
		
	}

}
