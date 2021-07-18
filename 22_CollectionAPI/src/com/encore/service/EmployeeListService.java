package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Employee;

//기능의 템플릿을 모아놓은 인터페이스...

public interface EmployeeListService {
	void addEmployee(Employee e); //public abstract 생략...
	void deleteEmployee(String empId);
	void updateEmployee(Employee e);
	
	//메소드 오버로딩.. 메소드 이름은 같지만 다루는 인자가 다름!
	ArrayList<Employee> findEmployees(String addr);
	void findEmployees();
	
	

}
