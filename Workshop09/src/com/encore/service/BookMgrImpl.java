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

import com.encore.exception.ISBNNotFoundException;
import com.encore.exception.QuantityException;
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
					System.out.println("파일 생성 성공...");
			}catch(IOException e) {
				System.out.println("파일 생성 실패...");
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
	public void sell(String isbn, int quantity) throws ISBNNotFoundException,QuantityException {
		for(Book b : bList) {
			if(b.getIsbn().equals(isbn)) {
				quantity--;
				System.out.println("도서가 판매되어" + quantity + "권 남았습니다.");
			}
		}if(Book.getQuantity()>quantity) {
			quantity--;
			System.out.println("도서가 판매되어" + quantity + "권 남았습니다.");
		}
	}
		
	@Override
	public void buy(String isbn, int quantity) throws ISBNNotFoundException {
		for(Book b : bList) {
			if(b.getIsbn().equals(isbn)) {
				quantity++;
				System.out.println("도서가 구매되어" + quantity + "권입니다.");
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
