package com.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private final List<Order> orderList = new ArrayList<Order>();

	public void placeOrder(Order order) {
		orderList.add(order);
	}

	public void processOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}