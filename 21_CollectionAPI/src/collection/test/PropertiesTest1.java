package collection.test;

import java.util.Enumeration;
import java.util.Properties;

/*
 * system 위에 탑재된 VM 관련 환경변수들 값을 콘솔로 출력하는 로직 작성
 */

public class PropertiesTest1 {

	public static void main(String[] args) {
		Properties p = System.getProperties(); //1
		Enumeration e = p.propertyNames(); //2
		while(e.hasMoreElements()) { //3
			String name = (String)e.nextElement(); //object로 리턴되므로 string으로 캐스팅하기
			String value = p.getProperty(name);
			System.out.println(name+"========================" + value);
		}
		

	}

}
