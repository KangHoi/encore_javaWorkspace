package com.encore.util;

public class MyDate {
	public int year;
	public int month;
	public int date;
	
	public MyDate(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public String getDate() {
		return year + " - " + month + " - " + date;
	}
}
