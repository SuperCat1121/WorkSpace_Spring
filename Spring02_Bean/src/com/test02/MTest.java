package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test01.MessageBean;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/AddressBeans.xml");
		Address hong = (Address) factory.getBean("hong");
		Address lee = (Address) factory.getBean("lee");
		Address kim = (Address) factory.getBean("kim");
		
		System.out.println(hong);
		System.out.println(lee);
		System.out.println(kim);
		
		// getBean(1, 2) : 2번째 파라미터는 돌려줄 클래스타입
		JobAddress jHong = factory.getBean("jHong", JobAddress.class);
		System.out.println(jHong);
		
		JobAddress jLee = factory.getBean("jLee", JobAddress.class);
		System.out.println(jLee);
		
		JobAddress jKim = factory.getBean("jKim", JobAddress.class);
		System.out.println(jKim);
	}

}
