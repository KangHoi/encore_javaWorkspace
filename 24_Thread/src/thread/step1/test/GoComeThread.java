package thread.step1.test;
/*
 * Thread 클래스를 상속받아서 Thread를 만들어본다.
 * Thread는 2개를 생성
 * GoThread, ComeThread
 */
class GoThread extends Thread{
	
	//Thread가 작동하는 부분..반드시 작성=run() 블락 안에서 해당 Thread가 전담하는 일을 확인할 수 있다.
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
	
	//Thread가 작동하는 부분..반드시 작성=run() 블락 안에서 해당 Thread가 전담하는 일을 확인할 수 있다.
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
		//GoComeThread라는 프로세스 안에서 2개의 Thread를 동작시켜보도록
		GoThread t1 = new GoThread();
		ComeThread t2 = new ComeThread();
		
		t1.start(); //run아니고 start를 호출해야함
		t2.start();
		

	}

}
