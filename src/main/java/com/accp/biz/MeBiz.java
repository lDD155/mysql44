package com.accp.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.MeDao;
import com.accp.pojo.Message;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class MeBiz {

	@Autowired
	private MeDao dao;
	
	public PageInfo<Message> find(Integer p,Integer s){
		PageHelper.startPage(p, s);
		return new PageInfo<Message>(dao.query());
	}
	public int addMassage(Message m) {
		
		return dao.add(m);
	}
	public int dz(int id,int zp) {
		
		return dao.update(id, zp);
	}
}
