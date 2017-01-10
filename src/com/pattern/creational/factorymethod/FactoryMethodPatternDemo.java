package com.pattern.creational.factorymethod;

public class FactoryMethodPatternDemo {
	private static String country = "Singapore"; // India/USA

	public static void main(String[] args) {
		System.out.println("Currency details for countries:\n");
		CurrencyFactory currencyFactory = new CurrencyFactoryImpl();

		Currency currency = currencyFactory.createCurrency(country);
		System.out.println("Country: " + country + ", Currency: " + currency.getSymbol());

		country = "India";
		currency = currencyFactory.createCurrency(country);
		System.out.println("Country: " + country + ", Currency: " + currency.getSymbol());

		country = "USA";
		currency = currencyFactory.createCurrency(country);
		System.out.println("Country: " + country + ", Currency: " + currency.getSymbol());
	}

}
