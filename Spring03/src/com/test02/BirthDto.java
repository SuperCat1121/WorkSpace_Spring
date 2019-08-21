package com.test02;

public class BirthDto {

	private String name;
	private String birth;
	public BirthDto() {}
	public BirthDto(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\t 생일 : " + birth;
	}
	
	
}
