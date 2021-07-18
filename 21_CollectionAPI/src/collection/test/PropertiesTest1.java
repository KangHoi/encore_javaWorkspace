package collection.test;

import java.util.Enumeration;
import java.util.Properties;

/*
 * system ���� ž��� VM ���� ȯ�溯���� ���� �ַܼ� ����ϴ� ���� �ۼ�
 */

public class PropertiesTest1 {

	public static void main(String[] args) {
		Properties p = System.getProperties(); //1
		Enumeration e = p.propertyNames(); //2
		while(e.hasMoreElements()) { //3
			String name = (String)e.nextElement(); //object�� ���ϵǹǷ� string���� ĳ�����ϱ�
			String value = p.getProperty(name);
			System.out.println(name+"========================" + value);
		}
		

	}

}
