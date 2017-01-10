package com.pattern.creational.abstractfactory;

public abstract class CarManufacturer {

	public abstract DieselCar produceDieselCar(String name);

	public abstract PetrolCar producePetrolCar(String name);

}
