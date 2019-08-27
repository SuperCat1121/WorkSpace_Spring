package com.mvc.two.model;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {

	public String getHello() {
		return "Spring";
	}
}
