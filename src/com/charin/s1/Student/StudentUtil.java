package com.charin.s1.Student;

import java.util.Scanner;

public class StudentUtil {
	public Student makeStudent(){
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("이름을 입력하세요.");
		student.name = sc.next();
		System.out.println("번호를 입력하세요.");
		student.number = sc.nextInt();
		System.out.println("국어 성적을 입력하세요.");
		student.kor = sc.nextInt();
		System.out.println("영어 성적을 입력하세요.");
		student.eng = sc.nextInt();
		System.out.println("수학 성적 입력하세요.");
		student.math = sc.nextInt();
		
		return student;
	}
}
