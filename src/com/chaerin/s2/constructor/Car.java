package com.chaerin.s2.constructor;

public class Car {
	
	String brand;
	String company;
	int cc;
	String color;
	
	//생성자
	public Car(){			//메소드명 클래스명과 동일하게 써야됨
		this("k9");	//매개변수가 하나고 스ㅡ링 타입인 생성자를 호출한ㄷㅏ 그게 바로 밑인 19번으로 가고 값인 k9이 (string brand)값으로간다
//		this.company = "kia";
//		this.brand ="k9";
//		this.color="black";
//		this.cc = 5000;
	}
	//생성자 오버로딩 같은 변수로 여러개 선언
	public Car (String brand){
		this(brand,"black");
//		this.company = "kia";
//		this.brand = brand;
//		this.color="black";
//		this.cc = 5000;
	}
	public Car(String brand,String color) {
		this(brand, color,5000);
//		this.company = "kia";
//		this.brand = brand;
//		this.color=color;
//		this.cc = 5000;
	}
	public Car(String brand,String color,int cc) {
		this.company = "kia";
		this.brand = brand;
		this.color=color;
		this.cc =cc;
	}
	//멤버 메소드
	public void info() {	//메소드명 소문자
			System.out.println("맴버 매소드");
			System.out.println(this.company);
			System.out.println(this.brand);
			System.out.println(this.color);
			System.out.println(this.cc);
	}

}
