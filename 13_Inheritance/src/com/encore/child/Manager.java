package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

/*
 * �θ� Ŭ���� Employee�κ��� ��� ���� ���� �ް� 
 * �ڱ� �ڽŸ��� ����� �߰��ϴ� �ڽ�Ŭ����...
 * 
 * ������ ȣ�� ---> ��ü ����
 * 
 */
public class Manager extends Employee {
	
	//�ڽĸ��� ����� �߰�
	private String dept;
	
	/*
	 * �ڽ� ������... ��ü ���� �˰���
	 * �ڽĻ����� { ù���ο��� ������ �θ� �⺻ ������ ȣ�� �Ͼ��}
	 * 
	 */
	
	public Manager(String name, MyDate birthDay, double Salary, String dept) {//�ڽ��� �����Ƿ��� ��...
		//�θ� �⺻ ������ ȣ�� �ʼ�!!!... super();
		super(name, birthDay, Salary);
		
		this.dept = dept;

	
	}
	//Method Overriding
	/*
	 * step1. �θ� ���� ����� �����޴´�....�θ� ���� ����� ȣ��
	 * step2. �װ� �ڽſ� �°� ���ľ���.
	 * 
	 * 
	 * Overriding Rule
	 * 0. ��Ӱ����� �� �ɷ��� ���̿��� �Ͼ��.
	 * 1. �޼ҵ� ����δ� ��� ��ġ
	 * 2. �����δ� �ݵ�� �޶�� �Ѵ�.
	 * ---> �ϴ����� �޶������Ƿ� ���ο� �޼ҵ尡 ���������.
	 */
	public String getDetails() {
		return super.getDetails() + ", " + dept;
	}
	
}



