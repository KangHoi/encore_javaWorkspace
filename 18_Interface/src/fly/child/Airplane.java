package fly.child;
/*
 * �������̽��� �θ�� �� �ڽ� Ŭ������ 
 * �ݵ�� �θ� �������̽��� ������ �ִ� ��� �߻�޼ҵ带
 * �� �����ؾ��Ѵ�
 */

import fly.parent.Flyer;

public class Airplane implements Flyer {

	public void fly() {
		System.out.println("Airplane...fly...");
		
	}

	public void land() {
		System.out.println("Airplane...land...");
		
	}

	public void take_off() {
		System.out.println("Airplane...take_off...");
		
	}


}
