package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); //false
		System.out.println(p2 == p3); //false
		System.out.println(p3 == p4); //false
		System.out.println(p4 == p1); //true			
		System.out.println(p1.equals(p2)); //false
		System.out.println(p4.equals(p1)); //true
		// equals 는 to String 등과 마찬가지로 디폴트로 가지고 있는 값이라서 메소드를 따로 지정해주지 않아도 실행이 가능하다.
		// 만약 equals 의 실행을 바꾸고 싶으면 따로 메소드를 주어서 오버라이드 시키면 가능하다. 
		
		
	
	}

		

}


