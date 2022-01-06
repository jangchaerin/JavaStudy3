package com.chaerin.s2.constructor;

public class Engine {
	
	String name="v1";		//멤버변수
	String fuel="f1"; 			//1번
	
	{
		//초기화 블럭
		System.out.println("초기화 블럭");
		this.name = "v6";
		this.fuel = "f6";		//윗줄이랑 지금 줄 this 써도 되고 안써도됨
	}							//2번
	
	public Engine() {
		System.out.println("생성자 실행");
		this.name = "v8";
		this.fuel = "f8";
	}						//3번 실행뒤 9으로 덮어씌워짐

	public void info() {
		System.out.println(name);
		System.out.println(this.fuel);
	}
	
}
