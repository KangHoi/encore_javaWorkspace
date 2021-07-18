package thread.step2.test;
/*
 * Thread Ŭ������ ��ӹ޾Ƽ� Thread�� ������.
 * Thread�� 2���� ����
 * GoThread, ComeThread
 */
class GoThread implements Runnable{

	//Thread�� �۵��ϴ� �κ�..�ݵ�� �ۼ�=run() ��� �ȿ��� �ش� Thread�� �����ϴ� ���� Ȯ���� �� �ִ�.
	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//���� ���� ���� thread�� �̸��� �����ϴ� ���...
			String tname = Thread.currentThread().getName();
			System.out.println("CurrentThread Name::" + tname+"," +i);
			i++;
			if(i==20) break;
		}
		
	}
}
class ComeThread extends Thread{
	
	//Thread�� �۵��ϴ� �κ�..�ݵ�� �ۼ�=run() ��� �ȿ��� �ش� Thread�� �����ϴ� ���� Ȯ���� �� �ִ�.
	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String tname = Thread.currentThread().getName();
			System.out.println("CurrentThread Name::" + tname+"," +i);
			i++;
			if(i==20) break;
		}
		
	}
}
public class GoComeThread {

	public static void main(String[] args) {
		//GoComeThread��� ���μ��� �ȿ��� 2���� Thread�� ���۽��Ѻ�����
		GoThread go = new GoThread();
		ComeThread come = new ComeThread();
		
		Thread t1 = new Thread(go, "GoThread");
		Thread t2 = new Thread(come, "ComeThread");
		t1.start(); 
		t2.start();
		

	}

}
