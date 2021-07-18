package com.encore.service.test;

import com.encore.service.NoteBook;
import com.encore.service.Programmer;
import com.encore.util.MyDate;

public class ProgrammerTest {

	public static void main(String[] args) {
		
		//1. Programmer 객체 생성
		Programmer pro = new Programmer("James", new MyDate(1988,1,1),"Encore", "Java") ;
		
		
		//2. Programmer가 NoteBook을 가짐
		pro.buyNoteBook(new NoteBook(111, "HP", 223));
	
		//3. 개발자 정보와 노트북 정보 출력
		NoteBook myNoteBook = pro.getNoteBook();
		System.out.println("James가 구매한 노트북의 정보입니다..\n");
		System.out.println(myNoteBook.getNotfeBookInfo());
		
		System.out.println("\n James의 정보입니다..");
		System.out.println(pro.getProgrammerInfo());
		
		//4. 더 필요한 기능 있다면 알아서 추가하여 로직 작성... 

	}



}
