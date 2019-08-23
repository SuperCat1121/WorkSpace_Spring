package com.test04;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// TODO : 002. <bean id="userService" class="com.test04.UserServiceImpl">을 annotation으로
@Component("userService")
public class UserServiceImpl implements UserService {

	// TODO : 003. <bean id="myUser01" class="com.test04.UserDto">를 annotation으로
	@Resource(name="myUser01") // Resource 우선(자바것이라서), Qualifier는 스프링것이라서 나중에
	private UserDto dto;
	
	@Override
	public void addUser() {
		System.out.println("추가된 멤버 : " + dto.getName());
	}

}
