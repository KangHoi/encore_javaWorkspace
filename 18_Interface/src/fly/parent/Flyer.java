package fly.parent;
//������ �Ͱ� ���õ� �߻����� ��Ƴ��� �������̽�
/*
 * �������̽��� �������
 * 1. static final ���
 * 2. public abstract �޼ҵ�
 */
public interface Flyer {
	//�ʵ� ����.. ����� ����
	public static final int SIZE =100;
	
	public abstract void fly(); //abstract method... ����θ� �ְ� ������{}�� ���� �޼ҵ�
	void land(); //������ �޼ҵ� ���� Ÿ�� �տ� public abstract �����ȴ�.
	void take_off();
	

}