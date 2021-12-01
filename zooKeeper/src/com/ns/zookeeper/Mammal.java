package com.ns.zookeeper;

public class Mammal {
	public int energyLevel = 0;
	
	public int displayEnergy() {
		System.out.println("Your Energy Level: " + this.energyLevel);
		return this.energyLevel;
	}

}
