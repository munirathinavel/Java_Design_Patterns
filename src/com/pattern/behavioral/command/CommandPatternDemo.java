package com.pattern.behavioral.command;

public class CommandPatternDemo {

	public static void main(String[] args) {
		System.out.println("Performing stock operations ..");
		
		Broker broker = new Broker();
		
		Stock stock = new Stock();
		BuyStock buyStockOrder = new BuyStock(stock);		
		broker.placeOrder(buyStockOrder);
		
		SellStock sellStockOrder = new SellStock(stock);
		broker.placeOrder(sellStockOrder);

		//Process all orders
		broker.processOrders();
	}

}
