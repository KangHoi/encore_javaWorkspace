package com.encore.banking;
import com.encore.banking.Account;
// ���� ���� ������ ������ �ִ� Ŭ����
// ��������� ���� ��...Account�� Hasing �ؾ��Ѵ�

public class Customer {
	public String name;
	public int ssn;
	
	// Hasing �ܰ� - 1)�ʵ� ���� 2)����
	//1)�ʵ� ����
	public Account account;
	
	//������
	public Customer(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	//2)����
	public void setAccount(Account account) {
		this.account = account;
	}
	
	//3)���� ������ ������ �޾Ƽ� ����ϴ� ���..
	public Account getAccount() {
		return account;
	}
	
	public String getCustomerInfo() {
		return name + "," + ssn;
	}

	
}
