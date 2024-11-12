package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
        // User 객체는 직접 생성하지 않음
        User user1 = new User("jws", "j1234", "정우성");
        User user2 = new User("yjs", "y2345", "이효리");
        User user3 = new User("master", "m7788", "운영자");
        
        
        			
        Employee employee1 = new Employee("master", "m7788", "운영자", 5000000);
        
        // 출력
        user1.showInfo();
        user2.showInfo();
        user3.showInfo();

        employee1.showInfo();
    }

}

