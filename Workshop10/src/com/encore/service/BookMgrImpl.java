package com.encore.service;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.encore.parent.Book;


public class BookMgrImpl implements IBookMgr{
	BufferedReader br;
	BufferedWriter bw;
	File file;
	FileReader fr;
	FileWriter fw;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	FileOutputStream fos;
	FileInputStream fis;
	List<Book> bList = new ArrayList<>();
	private double total;
	private List<Book> b;
	
	private static BookMgrImpl singletone = new BookMgrImpl();
	public static BookMgrImpl getInstance() {
		return singletone;
	}
	private BookMgrImpl() {
		file = new File("book.dat");
		if(file.exists()) {
			getFile();
		}else {
			try {
				if(file.createNewFile())
					System.out.println("颇老 积己 己傍...");
			}catch(IOException e) {
				System.out.println("颇老 积己 角菩...");
			}
		}
	}
	public void getFile() {
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			bList = (ArrayList<Book>)ois.readObject();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
					if(br != null) 
						br.close();
				} catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	@Override
	public void saveFile() {
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(bList);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	@Override
	public boolean add(Book book) {
		return bList.add(book);
		
	}
	@Override
	public void sell(String isbn, int quantity) {
		for(Book b : bList) {
			if(b.getIsbn().equals(isbn)) {
				quantity--;
				System.out.println("档辑啊 魄概登绢" + quantity + "鼻 巢疽嚼聪促.");
			}
		}if(Book.getQuantity()>quantity) {
			quantity--;
			System.out.println("档辑啊 魄概登绢" + quantity + "鼻 巢疽嚼聪促.");
		}
	}
		
	@Override
	public void buy(String isbn, int quantity) {
		for(Book b : bList) {
			if(b.getIsbn().equals(isbn)) {
				quantity++;
				System.out.println("档辑啊 备概登绢" + quantity + "鼻涝聪促.");
			}
		}
		
	}

	@Override
	public double getTotalAmount() {
		for(Book b : bList) {
			double total = (b.getPrice()) * (b.getQuantity());
		}
		return total;
	}
	
	@Override
	public List<Book> search() {
		for(Book b : bList) {
			System.out.println(b);
		}
		return b;
	}


}
