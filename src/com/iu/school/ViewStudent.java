package com.iu.school;

public class ViewStudent {
	
	//view
	//학생의 모든 정보를 출력
	public void view(Student student) {
		System.out.println("이름 : "+student.name);
		System.out.println("번호 : "+student.num);
		System.out.println("국어 : "+student.kor);
		System.out.println("영어 : "+student.eng);
		System.out.println("수학 : "+student.math);
		System.out.println("총합 : "+student.total);
		System.out.println("평균 : "+student.avg);
		
	}
	
	
}
