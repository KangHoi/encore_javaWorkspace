package com.encore.banking;
//���忡 ���� ������ ������ �ִ� Ŭ����..
/*
 * 1. �ʵ� ����
 * 2. ���� ������ ��� ���: 1) setter 2) ������
 * 3. �ʵ� �� �޾ƿ´�
 */
	public class Account {
		
		public double balance; //�ʵ弱��
	
		public Account(double balance) { //������ ���� : ��ü ������ ���ÿ� �� ����, ����������Ŭ�� �Բ� �̷����
			this.balance = balance;
		}
		public void setBalance(double balance) { //set ��� : ��ü ���� �Ŀ� �� ����, ����������Ŭ�� �ٸ��� �̷����
			this.balance = balance;
		}
		
		public double getBalance() {
			return balance;
		}
		
		//�Ա�
		/*��� ���ݾ��� 
		 * amount 1õ�� �̻��� ���� �Ա��ϰ�
		 * �׷��� ������ ����!...�޼���...
		 */
		public void deposit(double amount) {
			//balance = amount + balance;
			if (amount >= 1000) {
					balance += amount;}
			else {
				System.out.println("1õ�� �̻���� �Ա� �����մϴ�.");
				return;
			}
		}
		
		//���
		/* ��� ���
		 * amount... �ܾ��� 1�����̸� 2���� ����� �ȵ�
		 * ���� �ް�
		 * �ȵɰ�� ����!... �޼���...
		 */
		public void withdraw(double amount) {
			if(balance >= amount) {
					balance -= amount;} 
			else {
				System.out.println("�ܾ��� ��� �ݾ׺��� �����ϴ�.");}
				return;
		}
	}

