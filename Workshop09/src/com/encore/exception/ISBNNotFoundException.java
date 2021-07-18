package com.encore.exception;

public class ISBNNotFoundException extends Exception{
	public ISBNNotFoundException() {
		System.out.println("찾으시는 도서가 없습니다..");
	}

}
