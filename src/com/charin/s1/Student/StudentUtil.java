package com.charin.s1.Student;

import java.util.Scanner;

public class StudentUtil {
	public Student [] makeStudent(){
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요.");
		int count = sc.nextInt();
		//Student student = new Student();
		Student student[] = new Student[count];
		
		for(int i=0;i<student.length;i++) {
		Student stu = new Student();
		System.out.println("이름을 입력하세요.");
		stu.name = sc.next();
		System.out.println("번호를 입력하세요.");
		stu.number = sc.nextInt();
		System.out.println("국어 성적을 입력하세요.");
		stu.kor = sc.nextInt();
		System.out.println("영어 성적을 입력하세요.");
		stu.eng = sc.nextInt();
		System.out.println("수학 성적 입력하세요.");
		stu.math = sc.nextInt();
		student[i]=stu;
		
	}
		return student;
	}
}
