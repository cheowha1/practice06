package com.javaex.ex01;

public class Customer extends Person{
	// 필드
	private String personName;
	
	//생성자
	public Customer(String personName) {
		super();
		this.personName = personName;
		System.out.println("Customer(String, int String) 생성자 호출");
	}
	
	// Getters/Setters
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	@Override
	public void showInfo() {
		System.out.println("이름:" + name + ", 핸드폰:"+ hp);
	}
	
}
