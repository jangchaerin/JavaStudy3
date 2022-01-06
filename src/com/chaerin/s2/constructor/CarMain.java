package com.chaerin.s2.constructor;

public class CarMain {

	public static void main(String[] args) {
		//변수선언 = new 생성자호출
		Car car = new Car();	//car생성자 호출한거다 . 객체만든거 아님
//		car.brand = "k7";
//		car.company = "kia";
//		car.cc = 2000;
		car.info();
//		car.Car(); 	// 생성자 다시 호출불가
		Car car2 = new Car("k5");
		car2.info();		//힘 안들이고 k9에서 k5으로 바뀜
		Car car3 = new Car("k3","blue");
		car3.info();
		Car car4 = new Car("k7","white",3000);
		car4.info();

	}

}
