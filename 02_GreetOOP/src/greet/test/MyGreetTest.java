package greet.test;

import greet.MyGreet;//JVM�� Ŭ������ ã�� �� import �ʼ�
//MyGreet�� greet���� ã�ƶ�
/*
 * MyGreet Ŭ������ �޼ҵ带 ���۽�Ű�� ���� Ŭ����...Test Ŭ����
 * 
 * 1. Ŭ���� ��ü�� ���� == ������ҵ��� �޸𸮿� �ö󰣴�
 * 2. ����
 *   1)�ʵ� --- �� �Ҵ�
 *   2)�޼ҵ� --- ȣ��(calling)
 */
public class MyGreetTest {
	//test Ŭ���� = ����Ŭ����
	//���� ����� �޸𸮿� �ø��� �۾����ϴ� testŬ����

	public static void main(String[] args) {//1
		//��ü�� ����
		/*
		 * �޸𸮿� mg��� �̸����� ��ü�� �ö󰣴�... 
		 * Ŭ������ �ı����� �ö󰣴�.
		 * 2��... �ʵ�1��, �޼ҵ� 1��
		 * 
		 * �޸� �ø��� ����(��ü �����ϴ� ����)??
		 * �޸� �ö� �ֵ鸸 �����ؼ� ��� �����ϴ�.
		 */
		MyGreet mg = new MyGreet();
		mg.sayHello("������"); //method calling
		//mg�� MyGreet�� �ִ� sayHello�� ȣ��(Calling)�Ѵ�.
		//method�� calling �ؾ߸� working �Ѵ�
		

	}

}
