package com.encore.datatype.test;
/*
 * WhiteBoardTest1 ... TestŬ���� �Ǵ� ���� Ŭ������ �θ���.
 * 
 * TestŬ���� �Ǵ� ���� Ŭ������ �ϴ� ��
 * 1) ��ü�� �����Ѵ�. == ��ü�� �������(�ı�)�� �޸𸮿� �ø���.
 * 2) �ı��� ����
 *    �ʵ� --- �� �Ҵ� --- ���� ���� �ϵ��ڵ��Ǹ� �װ��� ���α׷��� �ƴ� --�ȵ�
 *    �޼ҵ� --- Calling
 */
import com.encore.datatype.WhiteBoard;
public class WhiteBoardTest1 {

	public static void main(String[] args) {
		/*
		 * WhiteBoard ��ü�� wb��� �̸����� �ϳ� ����
		 * �ʵ忡 ���� �Է�
		 * �Էµ� ���� ���
		 * 
		 */
		WhiteBoard wb = new WhiteBoard();//float(32), double(64)
		wb.setInfo(100, 'w', 120.0f, "Encore", "plastic", true);
		wb.printInfo();

	}

}
