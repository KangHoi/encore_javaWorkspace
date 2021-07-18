package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class InheritanceTest1 {

	public static void main(String[] args) {
		
		Employee emp = new Employee("James", new MyDate(1982,3,2), 23000.0);
		Manager m = new Manager("Robert", new MyDate(198,4,2), 33000.0, "IT");
		Engineer eg = new Engineer("Gosling", new MyDate(1978,1,2), 33000.0, "Java",200);
		Secretary ss = new Secretary("Peter", new MyDate(1988,1,2), 34000.0, "Robert");
		
	
		//Robert�� �μ��� �ٲ۴�... IT ---> Marketing
		m.changeDept("Marketing");
		
		System.out.println(emp.getDetails());
		System.out.println(m.getDetails());
		System.out.println(eg.getDetails());
		System.out.println(ss.getDetails());
		
		///////////////////////// Polymorphism //////////////////////
		// �θ�Ÿ������ �ڽ��� �����Ѵ�.
		
		System.out.println("\n===========Polymorphism===================");
		
		Employee e1 = new Manager("Robert1", new MyDate(198,4,2), 33000.0, "IT1");
		Employee e2 = new Engineer("Gosling2", new MyDate(1978,1,2), 33000.0, "Java2",200);
		Employee e3 = new Secretary("Peter1", new MyDate(1988,1,2), 34000.0, "Robert1");
		
		//2. Object Casting ��� �ʿ�... �θ�� ã���� �ȵǰ� �ڽ� ������ ã�ƾ� �Ѵ�.. �ڽĸ��� ����̹Ƿ�
		((Manager) e1).changeDept("Marketing");
//		Manager m1 = (Manager)e1;
//		m1.changeDept("Marketing");
		
		
		
		/* 1.
		 * Virtual Method(������ �ڽ��� �޼ҵ�) Invocation ����
		 * ��Ӱ����� 2���� Ŭ�������� 
		 * �޼ҵ� �������̵��� ���� �� �߻��ϴ� ����
		 * 
		 * Compile Time Type �޼ҵ� - �θ� �޼ҵ� ȣ��
		 * Runtime Type �޼ҵ� - �ڽ��� �޼ҵ� ȣ��
		 */
		System.out.println(e1.getDetails()); //employee at getDetailsȣ��
		System.out.println(e2.getDetails());
		System.out.println(e3.getDetails());
		

	}

}
