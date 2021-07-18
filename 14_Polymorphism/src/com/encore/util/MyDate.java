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

	//Step1. Object가 가지고 있는 기능을 물려받았다.
	//Step2. 그걸 자신에게 맞게 고쳐쓴다. ... 이 두 가지가 override 과정
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", date=" + date + "]";
	}
	
//	public String getDate() {
//		return year + "-" + month + "-" + date;
//	}
	
	
	
	
}
