package com.javaex.ex04;

public class Employee extends User {
	protected int salary;
	

	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	
	public int getsalary() {
		return salary;
	}
	
	public void setsalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public void showInfo() {
		// 기본적인 월급
		System.out.println("#월급:" + salary);
		
		if ("운영자" .equals(getName()));{
			System.out.println("운영자의 월급은" + salary + "원 입니다.");
		}
	}
	
	
}
