package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Engineer extends Employee {

	private String tech;

	public Engineer(String name, MyDate birthDay, double Salary, String tech) {
		super(name, birthDay, Salary);
		this.tech = tech;
	}

	public String getDetails() {
		return super.getDetails() + ", " + tech;
	}
	
}



