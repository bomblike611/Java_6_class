package com.iu.game;

public class MainGame {
	public static void main(String[] args) {
		Monster m = new Monster();
		m.name="orc";
		m.hp=100;
		m.power=20;
		m.defence=10;
		Monster m2=new Monster();
		m2.name="orc";
		m2.hp=100;
		m2.power=20;
		m2.defence=10;
		Monster m3=new Monster();
		m3.name="throl";
		m3.hp=200;
		m3.power=50;
		m3.defence=30;
		
		Monster[]ar=new Monster[2];
		ar[0]=m;
		ar[1]=m2;
		
		
		Charactor c=new Charactor();
		c.name="iu";
		c.job="Magictine";
		c.hp=100;
		c.mp=200;
		c.power=50;
		c.defence=200;
		c.attack(ar);
		System.out.println(m.hp);
		System.out.println(m2.hp);
		System.out.println(m3.hp);
		
	}
}
