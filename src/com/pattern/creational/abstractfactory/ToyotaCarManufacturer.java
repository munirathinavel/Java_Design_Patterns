package com.pattern.creational.abstractfactory;

public class ToyotaCarManufacturer extends CarManufacturer {

	@Override
	public DieselCar produceDieselCar(String name) {
		if ("Innova".equals(name)) {
			return new ToyotaInnovaDieselCar();
		}
		throw new IllegalArgumentException("Toyota will not manufacture diesel car named: " + name);
	}

	@Override
	public PetrolCar producePetrolCar(String name) {
		if ("Innova".equals(name)) {
			return new ToyotaInnovaPetrolCar();
		}
		throw new IllegalArgumentException("Toyota will not manufacture petrol car named: " + name);
	}

}
