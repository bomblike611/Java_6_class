package com.iu.cook;

import java.util.Scanner;

public class Waiter {
	Chef chef=new Chef();
	Customer iu=new Customer();
	Scanner sc=new Scanner(System.in);

	
	public void order() {
		boolean check=true;
		iu.money=50000;
		while(check) {
			System.out.println("  어서오세요!! 메뉴를 골라주세요! ");
			System.out.println("===1.스테이크 2.파스타 3.종료===");
			int select=sc.nextInt();
			if(select==1) {
				Food food=chef.cooking(select);
				if(iu.money<food.price) {
					System.out.println("구매할 수 없습니다.");
				}else {
				iu.buy(food);
				}
			}else if(select==2) {
				Food food=chef.cooking(select);
				if(iu.money<food.price) {
					System.out.println("구매할 수 없습니다.");
				}else {
				iu.buy(food);
				}
			}else {
				System.out.println("종료합니다.");
				check=!check;
			}
			
		}
	}
	
}
