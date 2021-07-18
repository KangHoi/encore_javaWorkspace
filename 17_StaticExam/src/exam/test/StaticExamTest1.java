package exam.test;
/*
 * =========== static�� Ű���� ���� ==============
 * 1. ��ü���� ���� ���� �޸𸮿� �ö󰣴�.
 * 2. ��ü���� ���� �ξ� ������...Class File Loader��������...�̶� �޸� �ö󰣴�.
 *    JVM(STACK | HEAP(new Ű����� ������ ��ü�� �ö�) | ... Class Area(static�� �������� ���))
 * 3. static�� ������ �ʵ�� ������ ��ü�鿡�� ���� �����Ѵ�!!!
 * 4. static�� static���� ���Ѵ�
 * 5. static�� ��� �ȿ��� this ��� ����
 * 6. static�� final�� ���� �� ���� �Բ� ���ȴ�.
 *    ex) ��� �� ���� static final int BASIC_SALARY = 1000;
 * 7. static initialization block
 * 8. singletone
 */

class Member{
	//�ʵ� ������ static������ ����(local level�δ� ����� �� ����)
	static String name = "ȫ�浿"; //����ƽ
	static int age =22; //����ƽ
	
	int count =1; //�ʵ�
	
	
	//static block
	public static void getMember() {//static block
		System.out.println("��/��/��/��/"+ name);//static variable
		//System.out.println("��/��/��/��/"+ count);
	}
	//non-static block
	public void getMember2() {//static block
		System.out.println("��/��/��/��/"+ name);//static variable
	}
}

public class StaticExamTest1 {

	public static void main(String[] args) {
		//static�� ������ ����� �ٷ� �����ؼ� ��� ����... 
		//Class�̸�, static  �޼ҵ�
		Member.getMember();
		
		//
		Member m = new Member();
		m.getMember();
		m.getMember2();

	}

}
