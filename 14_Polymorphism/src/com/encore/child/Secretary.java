package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Secretary extends Employee {
	

	private String BossOfName;
	public Secretary(String name, MyDate birthDay, double Salary, String BossOfName) {
		super(name, birthDay, Salary);
		
		this.BossOfName = BossOfName;

	
	}

	public String getDetails() {
		return super.getDetails() + ", " + BossOfName;
	}
	//Ãß°¡

	public void changeBossOfName(String bossOfName) {
		BossOfName = bossOfName;
	}
	
}



