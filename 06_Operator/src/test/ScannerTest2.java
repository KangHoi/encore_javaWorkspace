package test;

import java.util.Scanner;
/*
 * Scanner Ŭ������ 
 * �����(�����Ͻ� �ƴ�) Ű����� �Էµ� ���� �޵��� ���ִ� ����� ������ �ִ� Ŭ����
 */

public class ScannerTest2 {

	public static void main(String[] args) {
		System.out.println("Ű����� ���� 2���� �̸��� �Է��ϼ���>>>");
		Scanner sc = new Scanner(System.in); //System.in�� Ű������ ����
		int i = sc.nextInt(); //������ �������� �����͸� ��ȯ�Ѵ�.
		int j = sc.nextInt();
		
		sc.nextLine(); //���Ⱑ ������ ����. �� ������ �������� �����͸� ��ȯ
		String name = sc.next(); // ������ �������� �����͸� ��ȯ�Ѵ�. nextLine�� next�� ���� �˱�
		
		
		System.out.println("���� �� i: " + i + ",j: "+ j);
		System.out.println(name);

	
	}

}
