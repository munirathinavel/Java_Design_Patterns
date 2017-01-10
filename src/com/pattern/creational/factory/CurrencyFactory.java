package com.pattern.creational.factory;

public class CurrencyFactory {

	private CurrencyFactory() {
	}

	private static class SingletonHolder {
		private static final CurrencyFactory INSTANCE = new CurrencyFactory();
	}

	public static CurrencyFactory getInstance() {
		return SingletonHolder.INSTANCE;
	}

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
