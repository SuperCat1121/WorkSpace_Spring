package com.test03;

import org.springframework.stereotype.Component;

@Component
public class LGTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("LG TV Power ON");
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV Power OFF");
	}

	@Override
	public void volumeUp() {
		System.out.println("LG TV Volume UP");
	}

	@Override
	public void volumeDown() {
		System.out.println("LG TV Volume DOWN");
	}

}
