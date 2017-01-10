package com.pattern.creational.abstractfactory;

public class ToyotaInnovaPetrolCar extends PetrolCar {

	@Override
	public void buy(double amount) {
		System.out.println("Buying Toyota Innova petrol car for " + amount + " INR");
	}

	@Override
	public void sell(double amount) {
		System.out.println("Selling Toyota Innova petrol car for " + amount + " INR");
	}

}
