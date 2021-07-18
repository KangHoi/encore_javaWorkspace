package com.encore.service;

import java.util.List;

import com.encore.exception.ISBNNotFoundException;
import com.encore.exception.QuantityException;
import com.encore.parent.Book;

public interface IBookMgr {

	public void getFile(); 
	public void saveFile();
	public boolean add(Book book);
	public void sell(String isbn, int quantity) throws ISBNNotFoundException, QuantityException;
	public void buy(String isbn, int quantity) throws ISBNNotFoundException;
	public double getTotalAmount();
	public List<Book> search();

	
}
