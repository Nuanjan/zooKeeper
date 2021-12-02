package com.ns.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		super.energyLevel = 300;
	}
	public void fly() {
		System.out.println("Fly");
		super.energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("eat Human!");
		super.energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("Attack Town");
		super.energyLevel -= 100;
	}
}
