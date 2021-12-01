package com.ns.zookeeper;

public class Gorilla extends Mammal  {
public void throwSomthing() {
	System.out.println("Throw something");
	super.energyLevel -= 5;
}
public void eatBananas() {
	System.out.println("Eat Banana");
	super.energyLevel += 10;
}

public void climb() {
	System.out.println("Climbed");
	super.energyLevel -= 10;
}
}
