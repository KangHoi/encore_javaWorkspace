package thread.step6.test;
/*
 * 특정한 일을 전담하는 Thread 클래스
 * MegaBox에서 좌석을 예매하는 일을 전담한다.
 * reserve()... 라는 기능을 구현..
 */
public class MegaBoxUser implements Runnable{
	private boolean seat = false; //좌석 예매가 끝났으면 true로 바뀐다.
	
	@Override
	public void run() {
		try {
			reserve();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}//run
	
	//좌석을 예매하는 기능...
	public synchronized void reserve() throws InterruptedException{
		String tName = Thread.currentThread().getName();
		System.out.println(tName + "님, 영화 예매하러 오셨습니다!!");
		if(seat == false) {//좌석이 비었다면 예매 가능
			Thread.sleep(1000);
			System.out.println(tName + "님, 좌석 예매 성공!!");
			seat = true; //반드시 넣어줘야 하는 코드
		}else {//이미 좌석이 예매된 상태.. 예매 불가
			System.out.println(tName + "님, 해당 좌석은 이미 완료된 상태입니다!");
		}
	}
	
}
