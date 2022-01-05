package com.charin.s1.Student;

import java.util.Scanner;

public class StudentUtil {
	
		//검색할 학생의 번호 입력
		//입력받은 번호와 일치하는 학생출력
		

		public Student search(Student [] students) {
			//검색할 학생의 번호를 입력
			//입력 받은 번호와 일치하는 학생을 찾아서 리턴
			Scanner sc = new Scanner(System.in);
			System.out.println("검색할 학생 번호 입력");
			int num = sc.nextInt();
			
			Student student = null;
			
			for(int i=0;i<students.length;i++) {
				if(students[i].number == num) {
					System.out.println("Find");
					student = students[i];
					break;
				}
			}
			
			return student;
			
		}
		
		
		
	
	
	
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
