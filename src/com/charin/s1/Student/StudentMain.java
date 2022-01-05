package com.charin.s1.Student;

public class StudentMain {
	public static void main(String[] args) {

		StudentController sc = new StudentController();
		
		//sc.start();
		Student student = new Student();
		student.name="iu";
		student.makeTotal();
		
		System.out.println("종료");

	}

}
