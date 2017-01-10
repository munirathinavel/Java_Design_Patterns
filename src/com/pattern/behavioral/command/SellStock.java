package com.pattern.behavioral.command;

public class SellStock implements Order {
	// Receiver class
	private Stock stock;

	public SellStock(Stock stock) {
		this.stock = stock;
	}

	public void execute() {
		stock.sell();
	}

}
