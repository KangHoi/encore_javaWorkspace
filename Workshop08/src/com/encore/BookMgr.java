package com.encore;

import java.util.ArrayList;

public interface BookMgr {
	public void manageAllBook(Book[] books);
	public void getFile(String isbn, String title, String author, String publisher, double price, String desc); 
	public void saveFile();
	public Book findBook(String eid) ;
	public void showAll();

}
