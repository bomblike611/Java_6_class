package com.iu.test;

public class SalCount {
	public int sal(int sal) {
		//국민연금 4.5%
		//건강보험 3.06%
		//고용보험 0.65%
		//산재보험 0.7%
		double k1=sal*0.045;
		double k2=sal*0.0306;
		double k3=sal*0.0065;
		double k4=sal*0.07;
		
		sal=sal-(int)(k1+k2+k3+k4);
		
		System.out.println("국민연금 : "+k1);
		System.out.println("건강보험 : "+k2);
		System.out.println("고용보험 : "+k3);
		System.out.println("산재보험 : "+k4);
		
		return sal;
		
	}
}
