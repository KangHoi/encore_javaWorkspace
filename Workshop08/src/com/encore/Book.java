package com.encore;

public abstract class Book {
	public String isbn;
	public String title;
	public String author;
	public String publisher;
	public double price;
	public String desc;
	
	
	public Book(String isbn, String title, String author, String publisher, double price, String desc) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}
	
	public Book() {
		this("1234", "노인과 바다", "해밍웨이", "가나다", 7000, "ㄴ");
	}
	
	public void manageBook() {
		isbn();
		title();
		author();
		publisher();
		price();
		desc();
		year();
		month();
	}

	public void isbn() {
		return;
		
	}
	public void title() {
		return;
	}
	public void author() {
		return;

	}
	public void publisher() {
		return;

	}
	public void price() {
		return;

	}
	public void desc() {
		return;

	}
	public abstract void year();
	public abstract void month();
	
	

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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", price=" + price + ", desc=" + desc + "]";
	}

	public static int getQuantity() {
		return 0;
	}
	
	
	
	
	

}
