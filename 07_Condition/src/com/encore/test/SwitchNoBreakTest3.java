package com.encore.test;

import java.util.Scanner;

public class SwitchNoBreakTest3 {

	public static void main(String[] args) {//����...
		/*
		 *���θ޼ҵ��� ���� �޼ҵ��� ����
		 * 1. ��ü ����...�ı��� �޸𸮿� �ø���.
		 * 2. �޼ҵ� ȣ��... �׸��� �ı��� ȣ���Ѵ�
		 * ��������� �޸𸮿� �ȿö� ���� ����� �� ����.
		 * ����Ϸ��� �޸𸮸� �÷��� �Ѵ�. == ��ü ����
		 * 
		 * ���� ��ü�� �������� ���� �ٷ� ����� �� �ִ� �͵��� �ִ�.
		 * �̹� �޸𸮿� �ö� �ִ�... static�� ������ �͵��� �̸� �ö� �ִ�.
		 * 
		 */
		int time = (int)(Math.random()*4)+8; //8~11���� ��µǵ��� ����
		System.out.println("[����ð�: "+ time + "��]");
		
		switch(time) {
		case 8:
			System.out.println("����� �غ��մϴ�...");
		case 9:
			System.out.println("ȸ�� ����, ���� ȸ�� �մϴ�...");
		case 10:
			System.out.println("���� ������ ���ϴ�.");
		case 11:
			System.out.println("�ܱٳ����ϴ�.");
		}//break�� ���� ������ ������ó�� ��� ����
	}

}
