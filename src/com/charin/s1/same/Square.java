package com.charin.s1.same;

public class Square {
	
	int garo;
	int sero;

	public boolean same(Square s, Square ss) { 		//힌트임
		//멤버변수 garo, 매개변수로 받은 객체의 garo가 같고
		//멤버변수 sero, 매개변수로 받은 객체의 sero가 같으면 true를 리턴
		//하나라도 틀리면 false를 리턴

		boolean check = (s.garo == ss.garo && s.sero==ss.sero) ;
		System.out.println(check);		
	
	return check;
	
	}

}
