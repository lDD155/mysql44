package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Message;

public interface MeDao {

	public List<Message> query();
	
	public int add(@Param("m") Message m);
	
	public int update(int id,int z);
}
