package com.erikshea.outlast.animals;

public class Dog extends Animal {
	
	// Subclass-specific property values
	public void reset(){
		this.type = "dog";
		this.naturalEnemyType = "cat";
		this.lifeExpectancy = 12;
		this.maxSize = 70;
		this.baseMaxEnergy = 30;
		this.baseMaxHealth = 75;
		super.reset();
	}
}
