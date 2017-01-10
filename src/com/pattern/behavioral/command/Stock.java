package com.pattern.behavioral.command;

public class Stock {
	private String buyStock = "Stock[name:Books, quantity:10]";
	private String sellStock = "Stock[name:Gifts, quantity:5]";

	public void buy() {
		System.out.println(buyStock + " bought");
	}

	public void sell() {
		System.out.println(sellStock + " sold");
	}

}
