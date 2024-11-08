package com.javaex.ex01;

public class Person {
	// 필드
	protected String name;
	protected String hp;
	
	// 생성자
	public Person() {
		System.out.println("Person() 생성자 호출");
	}
	
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
		System.out.print("Person(String, int) 생성자 호출");
		
	}
	
	// Getters/Setters
	public String getName() {
		return name;
	}
	
	public String getHp() {
		return hp;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	// 일반 메서드
	public void showInfo() {
		System.out.println("이름:" + name + ", 핸드폰:" + hp);
	}
	
}
