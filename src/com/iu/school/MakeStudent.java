package com.iu.school;

import java.util.Scanner;

public class MakeStudent {

	
	
	//setStudent
	//학생을 한명 만들어서
	//학생의 이름,번호,국어,영어,수학 입력후
	//되돌려주기
	
	public Student setStudent() {
		Scanner sc=new Scanner(System.in);
		
		Student student=new Student();
		System.out.println("이름 입력");
		student.name=sc.next();
		System.out.println("번호 입력 ");
		student.num=sc.nextInt();
		System.out.println("국어 점수");
		student.kor=sc.nextInt();
		System.out.println("영어 점수");
		student.eng=sc.nextInt();
		System.out.println("수학 점수");
		student.math=sc.nextInt();
		student.setTotal();
		student.setAvg();
		
		return student;
		
	}
	
}
