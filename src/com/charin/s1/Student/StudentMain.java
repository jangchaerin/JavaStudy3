package com.charin.s1.Student;

public class StudentMain {
	public static void main(String[] args) {
		System.out.println("start");
		StudentUtil su = new StudentUtil();		
	
		Student student =su.makeStudent();
		
		
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t");
		System.out.println("--------------------------------");
		System.out.print(student.name+"\t");
		System.out.print(student.number+"\t");
		System.out.print(student.kor+"\t");
		System.out.print(student.eng+"\t");
		System.out.println(student.math);
	
		System.out.println("finisth");
	}

}
