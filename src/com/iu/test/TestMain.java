package com.iu.test;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		
		/*Test t= new Test();
		t.info(30, 20);
		Phone p=new Phone();
		p.name="iphone";
		p.price=100;
		PhoneInfo phoneinfo =new PhoneInfo();
		phoneinfo.info(p);
		System.out.println(p.name);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("값을 입력해주세요.");
		SalCount salcount = new SalCount();
		int sal=6000000;
		sal=salcount.sal(sal);
		int m=39000000;
		m=salcount.sal(m);
		int f=34809094;
		f=salcount.sal(f);
		System.out.println(sal+m+f);
		
		
	}
}
