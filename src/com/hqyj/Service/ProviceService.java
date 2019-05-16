package com.hqyj.Service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hqyj.Bean.Provice;
import com.hqyj.Dao.ProviceDao;
import com.hqyj.Text.hibernateUnil;



public class ProviceService {
	Session session =hibernateUnil.getCurrectSession(); 
	ProviceDao provicedao = new ProviceDao();
	/**
	 * 
	 * @param name
	 * @return 0 数据库中存在该省份 1增加成功 
	 */
		public int AddProvice(String name){
			int result =0;
			Provice pro = new Provice();
			pro.setName(name);
			try {
				Transaction tr = session.beginTransaction();
				provicedao.AddProviceDao(pro);
				tr.commit();
				result=1;
				
			} catch (Exception e) {
				// TODO: handle exception
				return 0;
			}
			
			return result;
			
		}
		
		public int deleteProvice(String name){
			int result = 0;
			return result;
		}
	
	public Provice queryProviceName(String name){
		Transaction tr = session.beginTransaction();
		Provice pro = provicedao.queryName(name);
		tr.commit();
		return pro;
		
	}
	

}
