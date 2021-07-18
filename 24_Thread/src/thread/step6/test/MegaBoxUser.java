package thread.step6.test;
/*
 * Ư���� ���� �����ϴ� Thread Ŭ����
 * MegaBox���� �¼��� �����ϴ� ���� �����Ѵ�.
 * reserve()... ��� ����� ����..
 */
public class MegaBoxUser implements Runnable{
	private boolean seat = false; //�¼� ���Ű� �������� true�� �ٲ��.
	
	@Override
	public void run() {
		try {
			reserve();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}//run
	
	//�¼��� �����ϴ� ���...
	public synchronized void reserve() throws InterruptedException{
		String tName = Thread.currentThread().getName();
		System.out.println(tName + "��, ��ȭ �����Ϸ� ���̽��ϴ�!!");
		if(seat == false) {//�¼��� ����ٸ� ���� ����
			Thread.sleep(1000);
			System.out.println(tName + "��, �¼� ���� ����!!");
			seat = true; //�ݵ�� �־���� �ϴ� �ڵ�
		}else {//�̹� �¼��� ���ŵ� ����.. ���� �Ұ�
			System.out.println(tName + "��, �ش� �¼��� �̹� �Ϸ�� �����Դϴ�!");
		}
	}
	
}
