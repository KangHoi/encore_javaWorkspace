package collection.test;
/*
 * Set�� �ڽ� Ŭ����... Hashset
 * 1. �ߺ� ��� ����
 * 2. ������ �������ʴ´�.
 */

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("��ȣ��");
		set.add("�̼���");
		set.add("��ȣ��");//�ߺ�
		set.add("������");
		set.add("����ö");
		
		System.out.println(set.size());//4
		//Collection API�� ��ü������ toString()�� �������̵��Ǿ��ִ� --> ������ ��µȴ�
		System.out.println(set.toString());//������ ���
		boolean flag = set.contains("�̻��");
		System.out.println("�̻���� ���ԵǾ����ִ°�?" + flag); //false
		System.out.println("set Collection�� �����Ͱ� ����� �ֳ���?" + set.isEmpty() ); // false
		
		//������ ����
		set.remove("������");
		//��� set������ ���
		System.out.println(set);
		//��� ������ ����
		set.clear();
		//��� set������ ���
		System.out.println("set Clleciotn�� �����Ͱ� ������?" + set.isEmpty());//true
	}

}
