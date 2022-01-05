package com.charin.s1.Student;

import java.util.Scanner;

public class StudentUtil {
	Scanner sc;
	//학생 객체를 생성하고 정보를 입력받는곳
	public void initUtil() {
		
		sc = new Scanner(System.in);	//this.sc = 이다. this. 생략되어있음
		
		
	}
		public Student search(Student [] students) {
		
		//검색할 학생의 번호 입력
		//입력받은 번호와 일치하는 학생출력
			
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

		public Student []  makeStudents() {
			
			//학생의 수를 입력 받음
			System.out.println("학생 수 입력");
			int count = sc.nextInt();
			Student [] students = new Student[count];
			
			for(int i=0;i<students.length;i++) {
				Student student = new Student();
				//키보드로 부터 이름, 번호, 국어 영어 수학 입력
				System.out.println("이름 입력");
				student.name = sc.next();
				System.out.println("번호 입력");
				student.number = sc.nextInt();
				System.out.println("국어 입력");
				student.kor = sc.nextInt();
				System.out.println("영어 입력");
				student.eng = sc.nextInt();
				System.out.println("수학 입력");
				student.math = sc.nextInt();
				student.makeTotal();
				students[i]=student;
			}
			
			//학생들의 정보를 리턴
			return students;
		}
		
		
	public Student [] makeStudent(){
		
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
