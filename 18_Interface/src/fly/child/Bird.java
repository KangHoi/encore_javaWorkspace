package fly.child;
/*
 * �������̽��� �θ�� �� �ڽ� Ŭ������ 
 * �ݵ�� �θ� �������̽��� ������ �ִ� ��� �߻�޼ҵ带
 * �� �����ؾ��Ѵ�
 */

import fly.parent.Flyer;

public class Bird implements Flyer {

	public void fly() {
		System.out.println("Bird...fly...");
		
	}

	public void land() {
		System.out.println("Bird...land...");
		
	}

	public void take_off() {
		System.out.println("Bird...take_off...");
		
	}
	
	//�ڽĸ��� �޼ҵ�...
	public String layEggs() {
		return "���� ���� ���";
	}
	

}
