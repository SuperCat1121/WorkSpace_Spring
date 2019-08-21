package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationBeans.xml");
		
		Emp developer = factory.getBean("you", Emp.class);
		System.out.println(developer);
		
		Emp engineer = factory.getBean("kang", Emp.class);
		System.out.println(engineer);
	}

}
