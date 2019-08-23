package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test01/applicationBeans.xml");
		
		AbstractTest bean = beans.getBean("singleton", AbstractTest.class);
		System.out.println("오늘은 " + bean.dayInfo() + " 입니다.");
		
		AbstractTest test = new Sunday();
		System.out.println(test.dayInfo());
	}
	/*
		싱글톤 레지스트리
		
		스프링이 직접 싱글톤 형태의 오브젝트를 만들고 관리하는 기능을 제공함
		(스프링 빈 오브젝트는 내부적으로 싱글톤 레지스트리를 만들어서 연동함)
	*/
}