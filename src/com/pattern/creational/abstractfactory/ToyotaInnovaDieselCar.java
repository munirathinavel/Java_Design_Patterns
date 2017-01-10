package com.pattern.creational.abstractfactory;

public class ToyotaInnovaDieselCar extends DieselCar {

	@Override
	public void buy(double amount) {
		System.out.println("Buying Toyota Innova diesel car for " + amount + " INR");
	}

	@Override
	public void sell(double amount) {
		System.out.println("Selling Toyota Innova diesel car for " + amount + " INR");
	}

}
