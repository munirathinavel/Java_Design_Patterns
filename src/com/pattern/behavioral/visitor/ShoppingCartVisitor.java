package com.pattern.behavioral.visitor;

public class ShoppingCartVisitor implements IVisitor {

	@Override
	public double visit(Book book) {
		double totalPrice = book.getPrice() * book.getQuantity();
		System.out.println("\tBook ISBN: " + book.getIsbn() + " price: " + book.getPrice()
				+ " quantity:" + book.getQuantity() + " total price: " + totalPrice);
		return totalPrice;
	}

	@Override
	public double visit(Fruit fruit) {
		double totalPrice = fruit.getPrice() * fruit.getQuantity();
		System.out.println("\tFruit name: " + fruit.getName() + " price: " + fruit.getPrice()
				+ " quantity: " + fruit.getQuantity() + " total price: " + totalPrice);
		return totalPrice;
	}

}
