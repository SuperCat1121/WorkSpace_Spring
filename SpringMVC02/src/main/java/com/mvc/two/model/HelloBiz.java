package com.mvc.two.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloBiz {
	
	@Autowired
	HelloDao dao;

	public String getHello() {
		return dao.getHello();
	}
}
