package com.encore.vo;

import com.encore.util.MyDate;

public class Engineer {
	private String name;
	private MyDate birthdate;
	private double salary;
	private String tech;
	private double bonus;
	
	public Engineer(String name, MyDate birthdate, double salary, String tech, double bonus) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.salary = salary;
		this.tech = tech;
		this.bonus = bonus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(MyDate birthdate) {
		this.birthdate = birthdate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	

}
