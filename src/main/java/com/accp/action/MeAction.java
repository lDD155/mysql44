package com.accp.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.MeBiz;
import com.accp.pojo.Message;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/me")
public class MeAction {

	@Autowired
	public MeBiz biz;
	
	@RequestMapping(value = "/list/{p}/{s}", method = RequestMethod.GET)
	public PageInfo<Message> lists(Integer p,Integer s){
		
		if(p==null) {
			p=1;
		}
		if(s==null) {
			s=3;
		}
		return biz.find(p, s);
	}
	@RequestMapping(value = "/message/add", method = RequestMethod.POST)
	public Map<String, String> addMessage(@RequestBody Message m) {
		Map<String, String> message = new HashMap<String, String>();
		biz.addMassage(m);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
		
	}
}
