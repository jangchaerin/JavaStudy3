package com.chaerin.s2.constructor;

public class EngineMain {

	public static void main(String[] args) {

		Engine engine = new Engine();
		System.out.println("객체생성후 대입");		//객체생성후 값 대입해주는 방식이 제일 마지막
		engine.name="v9";
		engine.fuel="f9";
		engine.info();
	}

}
