package com.upgrade.mvc.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAop {

	@Before("execution(public * com.upgrade.mvc.dao.*Dao*.*(..))")
	public void before(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		// clazz : 클래스
		
		logger.info("------------ logger start ------------");
		Object args[] = join.getArgs();
		if(args != null) {
			logger.info("Method : " + join.getSignature().getName());
			for(int i=0 ; i<args.length ; i++) {
				logger.info(i + "번째 : " + args[i]);
			}
		}
		/*
			.getTarget() : 대상 객체 (cc)
			.getArgs() : 대상 메서드의 파라미터들
			.getSignature : 대상 메서드 정보
		*/
	}
	
	@After("execution(public * com.upgrade.mvc.dao.*Dao*.*(..))")
	public void after(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		logger.info("------------ logger end ------------");
	}
	
}
