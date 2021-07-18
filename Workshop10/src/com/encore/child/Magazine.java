package com.encore.child;

import com.encore.parent.Book;

public class Magazine extends Book {

	public int month;

	public Magazine(String isbn, String title, double price, int quantity, int month) {
		super(isbn, title, price, quantity);
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Magazine [month=" + month + "]";
	}
	
	
	
	
}
