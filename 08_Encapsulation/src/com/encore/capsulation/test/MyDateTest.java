package com.encore.capsulation.test;

import java.util.Scanner;

import com.encore.capsulation.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��¥�� �Է��ϼ���... ��, �� ��>>>");
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		MyDate md = new MyDate();
		System.out.println(md);
		
		md.setMonth(month);//calling...
		md.setDay(day);//calling...
		
		System.out.println("������ " + md.getMonth() +"��" + md.getDay() + "�� �Դϴ�.");
		
	}

}