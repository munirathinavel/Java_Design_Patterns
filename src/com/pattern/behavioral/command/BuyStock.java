package com.pattern.behavioral.command;

public class BuyStock implements Order {
	// Receiver class
	private Stock stock;

	public BuyStock(Stock stock) {
		this.stock = stock;
	}

	public void execute() {
		stock.buy();
	}

}
