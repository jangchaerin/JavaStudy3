package com.charin.s1.Student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		StudentUtil studentUtil = new StudentUtil();
		//studentUtil.initUtil();		//StudentUtil의 8 9 10번을 해주면 이 줄은 안써줘도됨
		StudentView sv = new StudentView();
		Student[] students = null;
	
		while (check) {
			System.out.println("----------------------");
			System.out.println("1. 학생들의 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 학생정보 검색 출력");
			System.out.println("4. 프로그램 종료");
			System.out.println("----------------------");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("학생들의 정보 입력을 선택하셨습니다.");
				students = studentUtil.makeStudent();
				break;
			// ---------------------------------------------------------
			case 2:
				if (students != null) {
					System.out.println("학생들의 정보 출력을 선택하셨습니다.");
					sv.viewStudents(students);
					
				} else {
					sv.viewMessage("학생정보를 먼저 입력하세요");
				}
				break;
			// ---------------------------------------------------------
			case 3:
				System.out.println("학생정보 검색을 선택하셨습니다.");
				if (students == null) {
					sv.viewMessage("학생정보가 없습니다.");
				}
				Student student = studentUtil.search(students);
				if (student != null) {
					sv.viewStudent(student);
				} else {
					sv.viewMessage("검색결과가 없습니다.");
				}

				break;
			// ---------------------------------------------------------
			default:
				// check != check;
				check = false;
				break;
			}
		}

	}

}
