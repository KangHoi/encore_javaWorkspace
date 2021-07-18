package com.encore.service;

import java.util.List;


import com.encore.parent.Book;

public interface IBookMgr {

	public void getFile(); 
	public void saveFile();
	public boolean add(Book book);
	public void sell(String isbn, int quantity);
	public void buy(String isbn, int quantity);
	public double getTotalAmount();
	public List<Book> search();

	
}
