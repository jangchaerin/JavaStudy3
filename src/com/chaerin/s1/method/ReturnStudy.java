package com.chaerin.s1.method;

import java.util.Random;
import java.util.Scanner;

public class ReturnStudy {
	
	//접근지정자 [그외지정자] 리턴타입 메서드명 ([매개변수선언]){}
	

	
	
	public String test3() {
		//키보드로부터 이름 입력받고 리턴
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		return name;
	}
	
	
	public int test2() {
		Random random = new Random();
		int num = random.nextInt();
		System.out.println("test2 : "+num);
		return num;
	}
	
	
	public void test1() {
		System.out.println("void 리턴이 없을때 사용.");
	}

}
