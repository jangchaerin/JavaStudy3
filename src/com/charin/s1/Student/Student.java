package com.charin.s1.Student;

public class Student {

	String name;
	int number;
	int kor;
	int eng;
	int math;

	
	public void makeTotal() {
		int total = kor +eng+math;
		System.out.println(total);
	}
	
	public void hello() {
		System.out.println("hello");
	}
}
