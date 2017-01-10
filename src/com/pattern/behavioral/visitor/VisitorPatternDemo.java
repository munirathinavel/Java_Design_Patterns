package com.pattern.behavioral.visitor;

public class VisitorPatternDemo {
	public static void main(String[] args) {
		System.out.println("Visiting shop for purchase ..");
		System.out.println("Selected following items: ");
		IItem[] items = new IItem[] { new Book("1234", 20, 3), new Book("5678", 100, 4),
				new Fruit("Banana", 10, 2), new Fruit("Apple", 5, 5) };

		double total = calculateTotalPrice(items);
		System.out.println("Shopping Total Price = " + total);

		System.out.println("Returing home ..");
	}

	private static double calculateTotalPrice(IItem[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitor();
		double sum = 0.0;
		for (IItem item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
