package com.encore.array;
//���忡 ���� ������ ������ �ִ� Account Ŭ����
public class Account {
	//1. �ʵ� ����
	private double balance; //�ܾ�
	private String bankName; //���� �̸�
	
	//2. ������ ��� ... ������ / setter
	public Account(double balance, String bankName) {
		super();
		this.balance = balance;
		this.bankName = bankName;
	}
	

	//3. �ʵ� ������ �޾ƿ�
	public String getDetail() {
		return balance + ", " + bankName;
	}
	
	//4. ������ ���
	public void withdraw(double amt) {
		if(balance>= amt) balance -= amt;
		else return;
	}
	
	public void deposit(double amt) {
		if(balance<=amt) balance += amt;
		else return;
	}


	
	//��� �߰�

	public double getBalance() {
		return balance;
	}


	public String getBankName() {
		return bankName;
	}
	
}//class