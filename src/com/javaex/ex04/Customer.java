package com.javaex.ex04;

public class Customer extends User {
	protected int point;
	
	
	public Customer(String id, String password, String name, int point) {
		super(id, password, name); // 부모 클래스의 생성자 호출
		this.point= point;
		}
	
	public int getpoint() {
		return point;
	}
	
	public void setpoint(int point) {
		this.point = point;
	}
	
	@Override
	public void showInfo() {
		System.out.println("#포인트:" + point);
	}
	

}
