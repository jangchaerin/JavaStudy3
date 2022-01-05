package com.charin.s1.Student;

public class StudentMain {
	public static void main(String[] args) {
		System.out.println("start");
		StudentUtil su = new StudentUtil();

		Student student[] = su.makeStudent();

		System.out.println("이름\t번호\t국어\t영어\t수학\t");
		System.out.println("--------------------------------------");
		for (int i = 0; i < student.length; i++) {
			Student stu = student[i];

			System.out.print(stu.name + "\t");
			System.out.print(stu.number + "\t");
			System.out.print(stu.kor + "\t");
			System.out.print(stu.eng + "\t");
			System.out.println(stu.math);
		}
		System.out.println("finisth");
	}

}
