package com.test01.anno;

import org.springframework.stereotype.Component;

// <bean id="nickName" class="com.test01.anno.NickName"/> -> @Component를 한줄로 표현
@Component
public class NickName {

	public NickName() {}
	public String toString() {
		return "별명 : 학생";
	}
}
