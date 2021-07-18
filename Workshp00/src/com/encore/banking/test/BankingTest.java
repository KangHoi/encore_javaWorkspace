package com.encore.banking.test;

import java.util.Scanner;

import com.encore.banking.Account;
import com.encore.banking.Customer;

public class BankingTest {

	public static void main(String[] args) {
		
		//1. Customer ��ü ����... �̶� �� ������ Scanner��ü�� ���� �Է�... �̸�, ssn��
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� ssn�� �Է����ֽʽÿ�");
		
		String name = sc.nextLine();
		int ssn = sc.nextInt();
		
		Customer customer = new Customer(name, ssn);
		
		//2. ���� ������ ����... �̶� Has a Relation(��¡ ����) ����
		customer.setAccount(new Account(10000.0));
		
		//3. ���� ������ ���� ��ȯ...
		Account myAccount = customer.getAccount();
		
		//4. ���� ���... 1���� �Ա�, 5õ�� �Ա�, 2õ�� �Ա�, 7õ�� ���
		myAccount.deposit(10000.0);
		myAccount.deposit(300);
		myAccount.withdraw(10000);
		myAccount.withdraw(20000.0);
		
		//5. �������� �ܾ��� �ַܼ� ���... 1���� + balance
		System.out.println("�ܾ��� " + myAccount.getBalance() + " ���Դϴ�!!");
		
		

	}

}
