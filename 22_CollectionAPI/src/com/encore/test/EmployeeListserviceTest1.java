package com.encore.test;

import com.encore.service.impl.EmployeeListServiceImpl;
import com.encore.util.MyDate;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeListserviceTest1 {

	public static void main(String[] args) {
		//1. Service ������ ��ü�� �ϳ� �޾ƿ´�..
		EmployeeListServiceImpl service = EmployeeListServiceImpl.getInstance();
				
		//2. method�� ���� ȣ��..
		System.out.println("======================== 1. add ================================== ");
		Manager m1 = new Manager("111", "��ȣ��",  "��赿", 500, "���ߺ�");
		Manager m2 = new Manager("222", "�̼���",  "���ǵ�", 400, "������");
		Manager m3 = new Manager("333", "������",  "���ʵ�", 600, "���");
		
		Engineer eg1 = new Engineer("444", "����ö",  "�Ŵ�浿", 450, "Python", 100);
		Engineer eg2 = new Engineer("555", "�̻��",  "���¿�", 500, "JS", 300);
		
		service.addEmployee(m1);
		service.addEmployee(m2);		
		service.addEmployee(m3);
		service.addEmployee(eg1);
		service.addEmployee(eg2);
		//service.addEmployee(m3);
		
		service.findEmployees();
		
		System.out.println("======================== 2. delete ================================== ");
		service.deleteEmployee("������");
		
		service.findEmployees("���ʵ�");
	
		System.out.println("========================");


	}

}