package com.encore.test;

import java.util.ArrayList;


import com.encore.child.Magazine;
import com.encore.parent.Book;
import com.encore.service.BookMgrImpl;

public class BookTest {
	public static void main(String[] args) {
		BookMgrImpl mgr = BookMgrImpl.getInstance();
		
		
		mgr.add(new Book("21424", "Java Pro",15000,5));
		mgr.add(new Book("35355","�м�����",30000,3));
		mgr.add(new Book("35895","ȭ�км�",28000,7));
		mgr.add(new Magazine("35535", "Java World", 23000,0,2));
		mgr.add(new Magazine("66541", "Python",25000,3,3));
		mgr.add(new Magazine("77833", "JavaScript",13000,5,4));
		mgr.add(new Magazine("92020", "HTML/CSS",17000,2,7));
		mgr.add(new Magazine("18840", "Spring",15000,1,7));
		
	
		
		System.out.println("===========��ü ���� ���� ��� ���===========");
		ArrayList<Book> books = (ArrayList<Book>)mgr.search();
		for(Book book:books) {
			System.out.println(book);
		}
		
		System.out.println("===========������ �ǸŵǾ� ��� ������ ���� ���===========");
		try {
			mgr.sell("21424", 3);		
		
			books = (ArrayList<Book>)mgr.search();
			for(Book book:books) {
				System.out.println(book);
			}
			} catch(Exception e) {
			}
		System.out.println("===========������ ���ŵǾ� ��� ������ ���ϴ� ���===========");
		try {
			mgr.buy("21424", 10);			
			books = (ArrayList<Book>)mgr.search();
			for(Book book:books) {
				System.out.println(book);
			}
		}catch(Exception e) {
		}
		
		System.out.println("===========��� �������� ����*�ݾ��� �Ͽ� �� ��� �ݾ��� ����===========");
		System.out.format("�� ��� �ݾ��� :: %d", mgr.getTotalAmount());
		
	//	mgr.close();
		
		System.out.println("**********************************************");
		BookMgrImpl mgr2 = BookMgrImpl.getInstance();
		System.out.println("===========��ü ���� ���� ��� ���===========");
		ArrayList<Book> books1 = (ArrayList<Book>)mgr2.search();
		for(Book book:books1) {
			System.out.println(book);
			}
		
		}
	}

		
		
	

