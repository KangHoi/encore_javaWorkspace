package com.encore.child;

import com.encore.parent.Person;

public class Student extends Person {

	private int StuId;

	public Student(String name, int age, String address, int stuId) {
		super(name, age, address);
		this.StuId = stuId;
	}

	@Override
	public String toString() {
		return super.toString() + ", Student [StuId=" + StuId + "]";
	}
	
	
}
