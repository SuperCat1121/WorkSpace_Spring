package com.test03;

import org.springframework.stereotype.Component;

@Component("samsong")
public class SamsongTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("Samsong TV Power ON");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsong TV Power OFF");
	}

	@Override
	public void volumeUp() {
		System.out.println("Samsong TV Volume UP");
	}

	@Override
	public void volumeDown() {
		System.out.println("Samsong TV Volume DOWN");
	}

}
