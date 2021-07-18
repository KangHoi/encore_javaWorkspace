package com.encore.vo;

import com.encore.util.MyDate;

public class Manager {
	private String name;
	private MyDate birthdate;
	private double salary;
	private String dept;
	private int deptno;
	
	public Manager(String name, MyDate birthdate, double salary, String dept, int deptno) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.salary = salary;
		this.dept = dept;
		this.deptno = deptno;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
	
	
	

}
