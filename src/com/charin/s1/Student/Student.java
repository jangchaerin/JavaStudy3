package com.charin.s1.Student;

public class Student {

	String name;
	int number;
	int kor;
	int eng;
	int math;
	
	int total;
	double avg;

	public void makeTotal() {
		int total=0;
		System.out.println("참조변수 this");
		System.out.println("참조변수 this : "+this);
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
		//평균계산
		
	}
	public void hello() {
		System.out.println("hello");
		makeTotal();
	}
}
