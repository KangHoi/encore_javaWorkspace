package thread.step4.test;

import javax.swing.JOptionPane;

/*
 *작업Thread를 사용
 *
 *로또번호 입력작업과 동시에 
 *카운팅 작업이 진행되도록 로직 작성
 *
 *방법
 *::
 *작업쓰레드 하나 추가.
 *CountingThread를 새롭게 하나 정의
 *-->로또번호 입력과 Counting 작업이 병렬적으로 처리되도록 로직 완성.
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
		//2. 일종의 카운팅 작업...10 9 8 7 6 ...
		CountingThread count = new CountingThread();
		count.start();
		
		//1. 데이터 입력... 작업 .. GUI
		String input = JOptionPane.showInputDialog("최종 로또 번호 마지막 자리 숫자를 입력하세요...");
		System.out.println("입력한 숫자는 "+input+" 입니다.");
		
		

	}

}


