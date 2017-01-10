package com.pattern.creational.abstractfactory;

public class MarutiCarManufacturer extends CarManufacturer {

	@Override
	public DieselCar produceDieselCar(String name) {
		if("Swift Desire".equals(name)){
			return new MarutiSwiftDesireDieselCar();
		}
		throw new IllegalArgumentException("Maruti will not manufacture diesel car named: "+ name);
	}

	@Override
	public PetrolCar producePetrolCar(String name) {
		if("Swift Desire".equals(name)){
			return new MarutiSwiftDesirePetrolCar();
		}
		throw new IllegalArgumentException("Maruti will not manufacture petrol car named: "+ name);
	}

}
