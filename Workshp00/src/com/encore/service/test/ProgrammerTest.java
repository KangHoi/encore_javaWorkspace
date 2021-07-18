package com.encore.service.test;

import com.encore.service.NoteBook;
import com.encore.service.Programmer;
import com.encore.util.MyDate;

public class ProgrammerTest {

	public static void main(String[] args) {
		
		//1. Programmer ��ü ����
		Programmer pro = new Programmer("James", new MyDate(1988,1,1),"Encore", "Java") ;
		
		
		//2. Programmer�� NoteBook�� ����
		pro.buyNoteBook(new NoteBook(111, "HP", 223));
	
		//3. ������ ������ ��Ʈ�� ���� ���
		NoteBook myNoteBook = pro.getNoteBook();
		System.out.println("James�� ������ ��Ʈ���� �����Դϴ�..\n");
		System.out.println(myNoteBook.getNotfeBookInfo());
		
		System.out.println("\n James�� �����Դϴ�..");
		System.out.println(pro.getProgrammerInfo());
		
		//4. �� �ʿ��� ��� �ִٸ� �˾Ƽ� �߰��Ͽ� ���� �ۼ�... 

	}



}
