package collection.test;

import java.util.ArrayList;
import java.util.List;

/*
 * List 
 * ������ �����鼭 ���������� index�� �����ȴ�
 * ��ü�� �����ϴ� ���
 * �ߺ� ���
 */



public class ArrayListTest3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//Order | Sorting
		list.add("��ȣ��");
		list.add("�̼���");
		list.add("��ȣ��");
		list.add("������");
		list.add("����ö");
		
		System.out.println(list);
		//3���� ��ü ����
		String name = list.remove(2);
		//������ ������ ���
		System.out.println("������ ����� "+ name + "�Դϴ�..");
		//ù���� �����͸� �������� ����
		list.set(2, "������");
		//��� ���� ���
		System.out.println(list);
		//list�� ����� ����� �� ������ �޾ƿ�
//		int cnt =0;
//		for(String str : list) {
//			if (str.equals("������")) System.out.println(list.get(cnt));
//			cnt++;
//		}
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals("������")) System.out.println(list.get(i));
		}
	}

}