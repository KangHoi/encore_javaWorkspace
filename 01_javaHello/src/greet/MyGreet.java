package greet;
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d1ccbea (java_01_JavaHello)

public class MyGreet {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		
	}//main
}//class

/*
 * 01 ������Ʈ�� ������
 * ::
 * Hello Java��� �λ񸻸� ����ϴ� �ڵ� ����ȴ�.
 * �ٸ� �λ��� ����Ϸ��� �ٽ� �ڵ带 �����ؾ� �Ѵ�.
 * -->����������, ���뼺 ���� �ڵ�/
<<<<<<< HEAD
 */
=======
//
/*main method�� �����Ƿ� �����ϸ� �Ǵ� Ŭ����
 * 
 */

public class MyGreet {
	public String message = "�ȳ��ϼ���^^"; //�ʵ� ���� �� �ʱ�ȭ ����
	/*message = �ʵ�(field) >>�ʵ�(���� ����Ǵ� ����) ����
	*message�� variable(����), "�ȳ��ϼ���^^"�� value(��)
	* =: �Ҵ�(assign, ���� �� ���� ���� ������ ��)
	* String: data Type
	* => �ʵ� ����: Data Type + ������;
	*/
	
	
	public void sayHello(String name) {//method worker
		//sayHello = �޼ҵ�(method)
		//�޼ҵ� ���� = �����{}���� + ������{}����
		System.out.println(message+", "+name);		
	}
}
>>>>>>> fea845f (java_02_GreetOOP)
=======
 */
>>>>>>> d1ccbea (java_01_JavaHello)
