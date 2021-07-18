package com.encore.test;
/*
 * Collection(����)
 * 1. Homogeneous Collection(���� ���� ����ü)
 * 2. Heterogeneous Collection(�̱��� ���� ����ü)
 */

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class HeterogeneousCollectionTest2 {

	public static void main(String[] args) {
		
		Employee[ ] emps = {
				new Employee("James", new MyDate(1982,3,2), 23000.0),
				new Manager("Robert", new MyDate(198,4,2), 33000.0, "IT"),
				new Engineer("Gosling", new MyDate(1978,1,2), 33000.0, "Java",200),
				new Secretary("Peter", new MyDate(1988,1,2), 34000.0, "Robert")
		}; // �θ�Ÿ������ �̱��� Ÿ���� ���� �� ����
		
		for(Employee e : emps) {
			System.out.println(e.getDetails());
		}
		System.out.println("===== ��� ����ε��� ������ ����մϴ�. =====\n");
		int total =0;
		for(Employee e : emps) {
			if(e instanceof Engineer){//engineer�� ���� ���ʽ��� �����ֱ� ���� �ۼ�
				System.out.println("Information :: " +e.getDetails());
				System.out.println("AnnualSalary :: " + (e.getSalary() *12 + ((Engineer) e).getBonus()));
			}else {
			System.out.println("Information :: " +e.getDetails());
			System.out.println("AnnualSalary :: " + e.getSalary() *12);
			System.out.println("-----------------------------------------------");
		}
				
	}
	}
}

	


