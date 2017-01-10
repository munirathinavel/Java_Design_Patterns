package com.pattern.creational.factorymethod;

public class CurrencyFactoryImpl extends CurrencyFactory {

	@Override
	public Currency createCurrency(String country) {
		if (country.equalsIgnoreCase("India")) {
			return new Rupee();
		} else if (country.equalsIgnoreCase("Singapore")) {
			return new SGDollar();
		} else if (country.equalsIgnoreCase("USA")) {
			return new USDollar();
		}
		throw new IllegalArgumentException("No such country found to get currency!");
	}

}
