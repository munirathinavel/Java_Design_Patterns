package com.pattern.creational.abstractfactory;

public class AbstractFactoryPatternDemo {

	private static String manufacturerName = "Maruti"; // Toyota
	private static String carName = "Swift Desire"; // Innova

	public static void main(String[] args) {
		System.out.println("Maruti car dealings: ");

		CarManufacturer carManufacturer = CarDealer.getCarManufacturer(manufacturerName);

		DieselCar dieselCar = carManufacturer.produceDieselCar(carName);
		dieselCar.buy(650000d);

		PetrolCar petrolCar = carManufacturer.producePetrolCar(carName);
		petrolCar.sell(850000d);

		System.out.println("\nToyota car dealings: ");
		manufacturerName = "Toyota";
		carName = "Innova";
		carManufacturer = CarDealer.getCarManufacturer(manufacturerName);

		petrolCar = carManufacturer.producePetrolCar(carName);
		petrolCar.buy(950000d);

		dieselCar = carManufacturer.produceDieselCar(carName);
		dieselCar.buy(750000d);

	}

}
