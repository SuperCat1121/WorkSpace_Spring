package com.test07;

public class LGTV implements TV {

	public LGTV() {
		System.out.println("LG TV 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("LG TV power on");
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("LG TV volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("LG TV volume down");
	}

}
