package com.encore.test1;

import java.util.Scanner;

/*
 * Scanner ��ü�� ���� 
 * 10~99 ������ ������ �ϳ� �Է¹޴´�. (�� �ڸ� ����)
 * 
 * 3,6,9... �� 3�� ��� ���� ���ԵǾ��� �ִ����� �������� �����ϴ� �˰���.
 * �ϳ� ������ --> @
 * �ΰ� ������ --> @@
 * ������     --> ���� ����
 * ���� ���
 * 
 * 31 --> @
 * 11 --> 11
 * 98 --> @
 * 29 --> @
 * 96 --> @@
 * 
 * ��Ʈ
 * 2�ڸ� ��...
 * ���ڸ� --- /
 * ���ڸ� --- %
 * 
 * ��� �����ϱ�
 * 
 */

public class Pattern369Test {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �ڸ� ���ڸ� �Է��ϼ���...");
		int i = sc.nextInt();
		if(i>=10 && i<=99) {
			int x = i % 10;//1�� �ڸ�
			int y = i / 10;//10�� �ڸ�
				if((x==3 || x==6 || x==9) && (y==3 || y==6 || y==9)) {
					System.out.println("@@");
					} 
				else if ((x==3 || x==6 || x==9) || (y==3 || y==6 || y==9)) {
					System.out.println("@");
					} 
				else System.out.println(i);
					
				}
		else System.out.println("�� �ڸ��� �ƴմϴ�...");
		
			
		}



	}
