package com.charin.s1.Student;

import java.util.Scanner;

public class StudentUtil {
	
	public StudentInfo [] makeStudents() {  //STUDENTINFO만 쓰면 안됨 배열타입임
	
			Scanner sc = new Scanner(System.in);
			
			System.out.println("학생수를입력하세요");
			int count = sc.nextInt();
			
			StudentInfo [] member = new StudentInfo[count];

			for (int i = 0; i <member.length; i++) {
				StudentInfo stu = new StudentInfo();

				System.out.println((i + 1) + "번째 학생 이름을 입력하세요.");
				stu.name = sc.next();
				System.out.println((i + 1) + "번째 학생 번호를 입력하세요.");
				stu.number = sc.nextInt();
				System.out.println((i + 1) + "번째 학생 국어 성적을 입력하세요.");
				stu.kor = sc.nextInt();
				System.out.println((i + 1) + "번째 학생 영어 성적을 입력하세요.");
				stu.eng = sc.nextInt();
				System.out.println((i + 1) + "번째 학생 수학 성적을 입력하세요.");
				stu.math = sc.nextInt();
				member[i] = stu; // 강사님이 여기 젤 마지막에 하셨음
			}
			return member;
		
	
	}
	
//	
//	public StudentInfo makeStudent() {
//		//키보드로 부터 이름, 번호, 국어, 영어 , 수학 입력받고 그걸 리턴
//		Scanner sc = new Scanner(System.in);
//		StudentInfo si = new StudentInfo();		
//		
//		System.out.println("이름을 입력하세요.");
//		si.name = sc.next();
//		System.out.println("번호를 입력하세요.");
//		si.number = sc.nextInt();
//		System.out.println("국어 점수를 입력하세요.");
//		si.kor = sc.nextInt();
//		System.out.println("영어 점수를 입력하세요.");
//		si.eng = sc.nextInt();
//		System.out.println("수학 점수를 입력하세요.");
//		si.math = sc.nextInt();
//		
//		
//		return si;
	}

}
