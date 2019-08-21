package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		UserService service = factory.getBean("service", UserServiceImpl.class);
		UserDto dto = factory.getBean("dto", UserDto.class);
		System.out.println(dto.getName());
		System.out.println(dto.getMyDate());
		service.addUser(dto);
		// 1. applicationContext.xml 에서 UserDto 객체를 만들자 (이름, 생일)
		// 2. Mtest 에서 service.addUser() argument로 1번에서
		//    만든 객체를 넣어주자
		
		((ClassPathXmlApplicationContext)factory).close();
	}

}
