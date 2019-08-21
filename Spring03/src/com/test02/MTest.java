package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationBeans.xml");
		
		BirthDto left = factory.getBean("left", BirthDto.class);
		System.out.println(left);
		
		BirthDto left2 = factory.getBean("left2", BirthDto.class);
		System.out.println(left2);
		
		BirthDto me = factory.getBean("me", BirthDto.class);
		System.out.println(me);
		// 1. 왼쪽 짝의 이름과 생일을 setter를 사용하여 값을 주입하고 출력
		// 2. 오른쪽 짝의 이름과 생일을 생성자를 사용하여 값을 주입하고 출력
		// 3. 내 이름과 생일을(마음대로) 값을 주입하고 출력하자
	}
}
