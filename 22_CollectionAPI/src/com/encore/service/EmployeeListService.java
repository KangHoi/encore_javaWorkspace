package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Employee;

//����� ���ø��� ��Ƴ��� �������̽�...

public interface EmployeeListService {
	void addEmployee(Employee e); //public abstract ����...
	void deleteEmployee(String empId);
	void updateEmployee(Employee e);
	
	//�޼ҵ� �����ε�.. �޼ҵ� �̸��� ������ �ٷ�� ���ڰ� �ٸ�!
	ArrayList<Employee> findEmployees(String addr);
	void findEmployees();
	
	

}
