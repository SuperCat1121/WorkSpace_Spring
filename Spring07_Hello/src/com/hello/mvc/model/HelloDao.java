package com.hello.mvc.model;

import org.springframework.stereotype.Repository;

// TODO 006 : Dao(@Repository)
@Repository
public class HelloDao {

	public String getHello() {
		// TODO 007 : dao에서 return
		return "mvc";
	}
}
