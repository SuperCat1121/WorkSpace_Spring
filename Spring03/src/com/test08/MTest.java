package com.test08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test08/applicationBeans.xml");
		//TV samsong = factory.getBean("Samsong", TV.class);
		//LGTV lg = factory.getBean("LG", LGTV.class);
		System.out.println("------------------------------------------");
		//samsong.powerOn();
		//samsong.powerOff();
		//samsong.volumeUp();
		//samsong.volumeDown();
		//lg.powerOn();
		//lg.powerOff();
		//lg.volumeUp();
		//lg.volumeDown();
		
	}

}
