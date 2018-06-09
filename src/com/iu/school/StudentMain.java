package com.iu.school;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		
		
		MakeStudent ms=new MakeStudent();
		ViewStudent vs=new ViewStudent();
		Student student=ms.setStudent();
		vs.view(student);
		
		
	}
}
