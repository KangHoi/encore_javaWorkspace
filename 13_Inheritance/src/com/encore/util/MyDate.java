package com.encore.util;

public class MyDate {
	private int year;
	private int month;
	private int date;
	
	public MyDate(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}

	//Step1. Object�� ������ �ִ� ����� �����޾Ҵ�.
	//Step2. �װ� �ڽſ��� �°� ���ľ���. ... �� �� ������ override ����
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", date=" + date + "]";
	}
	
//	public String getDate() {
//		return year + "-" + month + "-" + date;
//	}
	
	
	
	
}
