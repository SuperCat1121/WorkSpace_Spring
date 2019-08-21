package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test06/applicationBeans.xml");
		
		Developer dev = factory.getBean("kang", Developer.class);
		Engineer engi = factory.getBean("you", Engineer.class);
		System.out.println(dev);
		System.out.println(engi);
	}

}
