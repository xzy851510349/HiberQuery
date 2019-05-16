package com.hqyj.Text;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateUnil {
	public static Configuration config;
	public static SessionFactory factory;
	static{
		
		config = new Configuration();
		config.configure();
		factory = config.buildSessionFactory();
		
		
	}
	
	public static Session getCurrectSession(){
		return factory.getCurrentSession();
	}

}
