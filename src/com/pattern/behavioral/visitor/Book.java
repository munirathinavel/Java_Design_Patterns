package com.pattern.behavioral.visitor;

public class Book implements IItem<Book> {
	private String isbn;
	private double price;
	private int quantity;

	public Book(String isbn, double price, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public double accept(IVisitor visitor) {
		return visitor.visit(this);
	}

}
