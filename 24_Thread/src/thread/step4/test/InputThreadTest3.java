package thread.step4.test;
/*
 * 카운팅 작업 - CountThread
 * 숫자입력작업 - LottoInputThread
 * ::
 * 두 개의 Thread가 Process안에서 서로 리소스를 공유하면서 도는 상황을 로직으로 작성
 * 카운팅되는 상황을 서로 공유하도록 로직을 작성
 * ::
 * 1. 카운트가 다 끝나도록 숫자입력이 안되면 - 해당 프로그램을 종료
 * 2. 카운트 진행 도중에 숫자가 입력되면 - 더 이상 카운팅을 진행하지 않도록 한다
 * --> 위 2가지 요구사항이 충족되도록 로직 완성
 * 
 */

import javax.swing.JOptionPane;

class CountThread extends Thread{
	InputThreadTest3 process;
	
	public CountThread(InputThreadTest3 process) {
		super();
		this.process = process;
	}

	public void run() {
		for(int i=10;i>=1; i--) {
			if(process.inputCheck) break;
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
			}

		}//for
		
		if(!process.inputCheck) {
			System.out.println("\n\n 10초가 경과되었습니다.. 값 입력 시간 초과");
			System.exit(0);
		}

	}
}

class LottoInputThread extends Thread{
	InputThreadTest3 process;
	
	public LottoInputThread(InputThreadTest3 process) {
		super();
		this.process = process;
	}
	
	public void run() {
		String input = JOptionPane.showInputDialog("최종 로또 번호 마지막 자리 숫자를 입력하세요...");
		System.out.println("입력한 숫자는 "+input+" 입니다.");
		
		process.inputCheck = true;
	}
}

public class InputThreadTest3 {
	//필드.. Data.. Resource.. Thread가 공유
	
	boolean inputCheck = false;
	

	public static void main(String[] args) {
		InputThreadTest3 process = new InputThreadTest3();
		
		CountThread ct = new CountThread(process);
		LottoInputThread input = new LottoInputThread(process);
		
		ct.start();
		input.start();
		
		
		
 }
}


