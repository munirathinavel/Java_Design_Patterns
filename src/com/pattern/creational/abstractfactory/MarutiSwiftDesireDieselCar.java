package com.pattern.creational.abstractfactory;

public class MarutiSwiftDesireDieselCar extends DieselCar {

	@Override
	public void buy(double amount) {
		System.out.println("Buying Maruti Swift Desire diesel car for " + amount + " INR");
	}

	@Override
	public void sell(double amount) {
		System.out.println("Selling Maruti Swift Desire diesel car for " + amount + " INR");
	}

}
