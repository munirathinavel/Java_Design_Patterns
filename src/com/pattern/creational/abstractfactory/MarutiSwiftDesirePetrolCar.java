package com.pattern.creational.abstractfactory;

public class MarutiSwiftDesirePetrolCar extends PetrolCar {

	@Override
	public void buy(double amount) {
		System.out.println("Buying Maruti Swift Desire petrol car for " + amount + " INR");
	}

	@Override
	public void sell(double amount) {
		System.out.println("Selling Maruti Swift Desire petrol car for " + amount + " INR");
	}

}
