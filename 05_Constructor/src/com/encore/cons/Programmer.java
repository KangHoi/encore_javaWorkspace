package com.encore.cons;

import com.encore.util.MyDate;

//������ ������ ��� �ִ� Ŭ����..
public class Programmer {
	
	//1.�ʵ� ����...
	public String name;//String�� API ���̺귯��
	public MyDate birthday;//MyDate�� ���� ���� Ŭ����(User Definition)
	public float salary;
	public int bonus;
	
	//2. ����
	/*
	 * public void setProgrammer(String name, MyDate birthday, float salary, int
	 * bonus) { this.name = name; this.birthday = birthday; this.salary = salary;
	 * this.bonus = bonus; }
	 */
	
	//�߰�...������
	public Programmer() {	}//�⺻������... �ʵ� �ʱ�ȭ ���Ѵ�
	public Programmer(String name, MyDate birthday, float salary, int bonus) {
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
		this.bonus = bonus;
	} //������ ������...�ʵ� �ʱ�ȭ
	
	//�߰�...�������� ����(���� * 12 + bonus)�� �����ϴ� ����� ����
	public float getAnnualSalary() {
		return salary * 12 + bonus;
	}
	
	//3. �ʵ� �� �޾ƿ���
	public String getProgrammer() {
		return name + ", " + birthday.getDate() + "," + salary + "," +bonus;
	}


	//��� �߰�
	public String getName() {
		return name;
	}
	
	
}