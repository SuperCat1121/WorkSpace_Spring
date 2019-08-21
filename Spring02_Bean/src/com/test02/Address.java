package com.test02;

public class Address {

	private String name;
	private String addr;
	private String tel;
	
	public Address() {}
	public Address(String name, String addr, String tel) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return this.addr;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTel() {
		return this.tel;
	}
	@Override
	public String toString() {
		return "name : " + name + "\t  addr : " + addr + "\t  tel : " + tel;
	}
	
}
