package thread.step1.test;
/*
 * Thread Ŭ������ ��ӹ޾Ƽ� Thread�� ������.
 * Thread�� 2���� ����
 * GoThread, ComeThread
 */
class GoThread extends Thread{
	
	//Thread�� �۵��ϴ� �κ�..�ݵ�� �ۼ�=run() ��� �ȿ��� �ش� Thread�� �����ϴ� ���� Ȯ���� �� �ִ�.
	public void run() {
		int i=0;
		while(true) {
			System.out.println("Go....." +i);
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
			System.out.println("Come....." +i);
			i++;
			if(i==20) break;
		}
		
	}
}
public class GoComeThread {

	public static void main(String[] args) {
		//GoComeThread��� ���μ��� �ȿ��� 2���� Thread�� ���۽��Ѻ�����
		GoThread t1 = new GoThread();
		ComeThread t2 = new ComeThread();
		
		t1.start(); //run�ƴϰ� start�� ȣ���ؾ���
		t2.start();
		

	}

}
