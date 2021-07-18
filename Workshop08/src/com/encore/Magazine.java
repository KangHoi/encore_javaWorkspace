package com.encore;

public class Magazine extends Book{
	
	int year;
	int month;
	
	public Magazine(String isbn, String title, String author, String publisher, double price, String desc, int year, int month) {
		super(isbn, title, author, publisher, price, desc);
		this.year = year;
		this.month = month;
	}
	
	
	
	public int getYear() {
		return year;
	}



	public int getMonth() {
		return month;
	}



	@Override
	public String toString() {
		return "Magazine [year=" + year + ", month=" + month + "]";
	}



	@Override
	public void year() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void month() {
		// TODO Auto-generated method stub
		
	}

	
}
