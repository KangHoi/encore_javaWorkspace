package thread.step2.test;
/*
 * Thread 클래스를 상속받아서 Thread를 만들어본다.
 * Thread는 2개를 생성
 * GoThread, ComeThread
 */
class GoThread implements Runnable{

	//Thread가 작동하는 부분..반드시 작성=run() 블락 안에서 해당 Thread가 전담하는 일을 확인할 수 있다.
	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//현재 실행 중인 thread의 이름을 리턴하는 기능...
			String tname = Thread.currentThread().getName();
			System.out.println("CurrentThread Name::" + tname+"," +i);
			i++;
			if(i==20) break;
		}
		
	}
}
class ComeThread extends Thread{
	
	//Thread가 작동하는 부분..반드시 작성=run() 블락 안에서 해당 Thread가 전담하는 일을 확인할 수 있다.
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
		//GoComeThread라는 프로세스 안에서 2개의 Thread를 동작시켜보도록
		GoThread go = new GoThread();
		ComeThread come = new ComeThread();
		
		Thread t1 = new Thread(go, "GoThread");
		Thread t2 = new Thread(come, "ComeThread");
		t1.start(); 
		t2.start();
		

	}

}
