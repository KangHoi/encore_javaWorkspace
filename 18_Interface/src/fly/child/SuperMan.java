package fly.child;
/*
 * �������̽��� �θ�� �� �ڽ� Ŭ������ 
 * �ݵ�� �θ� �������̽��� ������ �ִ� ��� �߻�޼ҵ带
 * �� �����ؾ��Ѵ�
 */

import fly.parent.Flyer;

public class SuperMan implements Flyer {

	public void fly() {
		System.out.println("SuperMan...fly...");
		
	}

	public void land() {
		System.out.println("SuperMan...land...");
		
	}

	public void take_off() {
		System.out.println("SuperMan...take_off...");
		
	}
	
	//�ڽĸ��� �޼ҵ�...
	public String stop_Bullet() {
		return "����� �Ѿ��� ����";
	}
	

}
