package com.encore.capsulation.test;

import java.util.Scanner;

import com.encore.capsulation.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 날짜를 입력하세요... 월, 일 순>>>");
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		MyDate md = new MyDate();
		System.out.println(md);
		
		md.setMonth(month);//calling...
		md.setDay(day);//calling...
		
		System.out.println("오늘은 " + md.getMonth() +"월" + md.getDay() + "일 입니다.");
		
	}

}
