package com.encore.algo.test;

import java.util.Scanner;

public class ArrayPersonTypeTest {

	public static void main(String[] args) {
		//Ǯ�����...
		//GitLab <������ 02_javaWorkshop ����
		//���� �ȿ� ~.java ... commit
		
		Scanner sc= new Scanner(System.in);
		System.out.println("�������� �˻翡 ������ ����� ��� �� ���Դϱ�?");
		int num =sc.nextInt();
		
		
		int[ ] types = new int[num];
		System.out.println("1~5 ���� �ش��ϴ� ���������� �Է��ϼ���...");
		for(int i=0; i<types.length; i++) {
			types[i] = sc.nextInt();
		}
		
		
		int mode =0;
		int[ ] index = new int[types.length];
		int max = 0;
		for(int j =0;j< types.length; j++ ) {
			index[types[j]]++;
		}
		for(int j=0;j<index.length;j++) {
			if(max<index[j]) {
				max = index[j];
				mode = j;
			}
		}
		
		System.out.println("���� ����� ��������: " + mode );
		
		
		

	}

}
