package com.chaerin.s1.method;

public class MethodMain {

	public static void main(String[] args) {
	
		System.out.println("mainmethod start");
		System.out.println("confff test");
		System.out.println("github edit");
		
		//객체 셍성코드
		//new 클래스명();
		
		ReturnStudy rs = new ReturnStudy();
		rs.test1();
		
		int count=rs.test2();	//return하는 변수랑 달라도 됨
		System.out.println("main : "+count);
		
		String name =rs.test3();
		System.out.println(name);
		
		double num = Math.random();
		System.out.println("Math.random : "+num);
		
		System.out.println("mainmethod finish");

	}

}
