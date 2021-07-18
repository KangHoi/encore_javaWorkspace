package com.encore;

import java.util.ArrayList;

public abstract class BookMgrImpl implements BookMgr{
	static Book[ ] books;
	static int numberOfBooks =5;
	int idx;
	private ArrayList<Book> bList;
	

	private BookMgrImpl() {	}
	
	public BookMgrImpl(int numberOfBooks) {
		books = new Book[numberOfBooks];
	}
	
	public static int getNumberOfBooks() {
		return numberOfBooks ;
		}
	
	public static void insertBook(Book newBook) {
		for(int i=0; i<books.length; i++) {
			if(books[i] == null) {
				books[i] = newBook;
				numberOfBooks++;
				break;
			}else {
				System.out.println("이미 존재하는 책입니다.");
				return;
			}
		}
	}
	
	public static Book searchBookByIsbn(String isbn) {
		Book temp = null;
		for(Book b : books) {
			if(b != null) {
				if(b.isbn.equals(isbn)) {
					temp = b;
				}
			}
		}
		return temp;
	}
	
	public static Book[ ] searchBookByTitle(String title) {
		int i=0;
		int count =0;
		Book[] temp1 = new Book[numberOfBooks];
		for(Book b : books) {
			if(b != null) {
				if(b.title.equals(title)) {
				
					temp1[i++] = b;
					count++;
				}
			}
		}
		Book[ ] temp2 = new Book[count];
		for(int j=0; j<count; j++) {
			if(temp1[j] != null) {
				temp2[j] = temp1[j];
			}
		}
		return temp2;
	}
	
	
	public static Book[] searchBookByPublisher(String publisher) {
		int i=0;
		int count =0;
		Book[] temp1 = new Book[numberOfBooks];
		for(Book b : books) {
			if(b != null) {
				if(b.publisher.equals(publisher)) {
				
					temp1[i++] = b;
					count++;
				}
			}
		}
		Book[ ] temp2 = new Book[count];
		for(int j=0; j<count; j++) {
			if(temp1[j] != null) {
				temp2[j] = temp1[j];
			}
		}
		return temp2;
	}
	
	public static Book[] searchBookByPrice(double price) {
		int i=0;
		int count =0;
		Book[] temp1 = new Book[numberOfBooks];
		for(Book b : books) {
			if(b != null) {
				if(b.price == price) {
				
					temp1[i++] = b;
					count++;
				}
			}
		}
		Book[ ] temp2 = new Book[count];
		for(int j=0; j<count; j++) {
			if(temp1[j] != null) {
				temp2[j] = temp1[j];
			}
		}
		return temp2;
	}
	
	public static double getSumPriceOfBooks() {
		int total =0;
		for(Book b : books) {
			if(b != null) total += b.price;
		}
		return total;
	}
	
	public static double getAveragePriceOfBooks() {
		return getSumPriceOfBooks() / numberOfBooks;
	}
	
	

	@Override
	public void manageAllBook(Book[] books) {
		for(Book b : books) {
			System.out.println(b);
			b.manageBook();
			
		}
		
	}

}