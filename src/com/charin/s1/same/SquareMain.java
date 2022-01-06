package com.charin.s1.same;

public class SquareMain {

	public static void main(String[] args) {
		Square s1 = new Square();
		Square s = new Square();
		s1.garo = 4;
		s1.sero = 5;
		
		Square s2 = new Square();		//s1, s2 는 주소를 담고있다 -> 참조변수
		s2.garo = 4;
		s2.sero = 4;

		s.same(s1,s2);
	
//		boolean check = s.same(s1)==s.same(s2);
//		System.out.println(check);	
	}

}
