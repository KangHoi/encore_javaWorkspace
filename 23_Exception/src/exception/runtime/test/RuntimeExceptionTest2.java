package exception.runtime.test;

public class RuntimeExceptionTest2 {
	public static void main(String[] args) {
		//��ü �������� �ʰ� ���������� ������ �� �߻��ϴ� ����
		System.out.println("===================== NullPointExcepiton ===================");
		String str = "Encore";
		String str1 = new String("Encore");
		str1 = null; //��ü ������ ���� ���� �Ͱ� ������ ��� �߻�
		try {
			System.out.println("���ڿ� ���̸� ��ȯ�մϴ�" + str1.length()); //�����߻�
			System.out.println("toString() ��Ʈ�������� �������̵� �Ǿ��ִ�" + str1.toString());

		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("��Ҵ�..!");
//		} catch(NullPointerException e1) {
//			System.out.println("��Ҵ�..!!");
		}finally {//���� ������� ������ �� �κ� ����
			System.out.println("Always print...");
		}
		
		
	}

}
