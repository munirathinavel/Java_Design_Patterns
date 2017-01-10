package com.pattern.creational.abstractfactory;

public class CarDealer {

	public static CarManufacturer getCarManufacturer(String manufacturer) {
		if ("Maruti".equalsIgnoreCase(manufacturer)) {
			return new MarutiCarManufacturer();

		} else if ("Toyota".equalsIgnoreCase(manufacturer)) {
			return new ToyotaCarManufacturer();
		}
		throw new IllegalArgumentException("No such manufaturer found!");
	}

}
