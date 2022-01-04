package com.charin.s1.Student;

public class StudentMain {

	public static void main(String[] args) {
		// makeStudent메소드호출
		// 이름 번호 국어 영어 수학이 출력되어야한다.
		StudentUtil su = new StudentUtil();
		//StudentInfo si = new su.makeStudent();
		StudentInfo [] member = su.makeStudents();
		System.out.println("start");
		

		System.out.println("이름\t번호\t국어\t영어\t수학\t"); // '\t'는 일정간격 띄어줌
		System.out.println("------------------------------------");
for(int i = 0;i<member.length;i++) {
	StudentInfo si = member[i];
		System.out.print(si.name + "\t");
		System.out.print(si.number + "\t");
		System.out.print(si.kor + "\t");
		System.out.print(si.eng + "\t");
		System.out.println(si.math);
		
}
		System.out.println("finish");
	}

}
