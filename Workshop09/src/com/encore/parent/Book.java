package com.encore.parent;

public class Book {
	public String isbn;
	public String title;
	public double price;
	public static int quantity;
	
	public Book(String isbn, String title, double price, int quantity) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
	

}
