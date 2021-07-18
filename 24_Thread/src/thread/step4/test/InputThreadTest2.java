package thread.step4.test;

import javax.swing.JOptionPane;

/*
 *�۾�Thread�� ���
 *
 *�ζǹ�ȣ �Է��۾��� ���ÿ� 
 *ī���� �۾��� ����ǵ��� ���� �ۼ�
 *
 *���
 *::
 *�۾������� �ϳ� �߰�.
 *CountingThread�� ���Ӱ� �ϳ� ����
 *-->�ζǹ�ȣ �Է°� Counting �۾��� ���������� ó���ǵ��� ���� �ϼ�.
 */

class CountingThread extends Thread{
	public void run() {
	for(int i=10;i>=1; i--) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		System.out.println(i);
	}

}
}
public class InputThreadTest2 {

	public static void main(String[] args) {
		//2. ������ ī���� �۾�...10 9 8 7 6 ...
		CountingThread count = new CountingThread();
		count.start();
		
		//1. ������ �Է�... �۾� .. GUI
		String input = JOptionPane.showInputDialog("���� �ζ� ��ȣ ������ �ڸ� ���ڸ� �Է��ϼ���...");
		System.out.println("�Է��� ���ڴ� "+input+" �Դϴ�.");
		
		

	}

}


