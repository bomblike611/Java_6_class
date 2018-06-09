package com.iu.cook;

public class Customer {
	int money;
	
	public void buy(Food food) {
		System.out.println(food.name);
		System.out.println(food.price);
		System.out.println("==========================");
		System.out.println("현재 가지고 있는 돈 :"+money);
		System.out.println(food.name+"를 계산합니다.");
		money-=food.price;
		
		System.out.println("남은 돈 :"+money);
	}


}
