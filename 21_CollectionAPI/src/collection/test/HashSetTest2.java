package collection.test;
/*
 * Set의 자식 클래스... Hashset
 * 1. 중복 허용 안함
 * 2. 순서를 가지지않는다.
 */

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("강호동");
		set.add("이수근");
		set.add("강호동");//중복
		set.add("서장훈");
		set.add("김희철");
		
		System.out.println(set.size());//4
		//Collection API는 자체적으로 toString()이 오버라이딩되어있다 --> 데이터 출력된다
		System.out.println(set.toString());//데이터 출력
		boolean flag = set.contains("이상민");
		System.out.println("이상민이 포함되어져있는가?" + flag); //false
		System.out.println("set Collection에 데이터가 비어져 있나요?" + set.isEmpty() ); // false
		
		//서장훈 삭제
		set.remove("서장훈");
		//모든 set데이터 출력
		System.out.println(set);
		//모든 데이터 삭제
		set.clear();
		//모든 set데이터 출력
		System.out.println("set Clleciotn에 데이터가 없나요?" + set.isEmpty());//true
	}

}
