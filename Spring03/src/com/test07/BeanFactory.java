package com.test07;

public class BeanFactory {

	public Object getBean(String beanName) {
		if(beanName.equals("Samsong")) {
			return new SamsongTV();
		} else if(beanName.equals("LG")) {
			return new LGTV();
		}
		
		return null;
	}
}
