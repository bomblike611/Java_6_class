package com.iu.game;

public class Charactor {
	String name;
	String job;
	int hp;
	int mp;
	int power;
	int defence;
	
	//attack
	public void attack(Monster []ar) {
		//몬스터 hp=몬스터 hp-power
		for(int i=0;i<ar.length;i++) {
		ar[i].hp=ar[i].hp-power;
		}
		
	}
	
}
