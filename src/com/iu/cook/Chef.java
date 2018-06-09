package com.iu.cook;

public class Chef {

	public Food cooking (int select) {
		
		
		
		Food food=new Food();
		if(select==1) {
			food.name="steak";
			food.price=30000;
		}else {
			food.name="pasta";
			food.price=20000;
		}
		
		
		return food;
		
	}
	
}
