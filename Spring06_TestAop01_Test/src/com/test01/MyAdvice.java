package com.test01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAdvice {

	public MyAdvice() {}
	
	@Before("execution(public * com.test01.Person.sayName(..))")
	public void beforeSaying(JoinPoint join) {
		System.out.println("당신의 이름은 무엇입니까?");
	}
	
	@After("execution(public * com.test01.Person.sayJob(..))")
	public void afterSaying(JoinPoint join) {
		System.out.println("이름이 멋지시네요");
	}
	
	@AfterReturning("execution(public * com.test01.Person.sayJob(..))")
	public void afterReturnSaying(JoinPoint join) {
		System.out.println("직업이 무엇입니까?");
	}
}
/*
	- Before Advice : Joinpoint 앞에서 실행되는 Advice
	- Around Advice : Joinpoint 앞과 뒤에서 실행되는 Advice
	- After Advice : Joinpoint 호출이 리턴되기 직전에 실행되는 Advice
	- After Returning Advice : Joinpoint 메서드 호출이 정상적으로 종료된 후에 실행되는 Advice
	- After Throwing Advice : 예외가 발생했을때 실행되는 Advice
*/














