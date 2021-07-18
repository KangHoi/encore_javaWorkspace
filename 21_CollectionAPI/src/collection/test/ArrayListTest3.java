package collection.test;

import java.util.ArrayList;
import java.util.List;

/*
 * List 
 * 순서를 가지면서 내부적으로 index로 관리된다
 * 객체를 저장하는 방식
 * 중복 허용
 */



public class ArrayListTest3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//Order | Sorting
		list.add("강호동");
		list.add("이수근");
		list.add("강호동");
		list.add("서장훈");
		list.add("김희철");
		
		System.out.println(list);
		//3번재 객체 삭제
		String name = list.remove(2);
		//삭제된 데이터 출력
		System.out.println("삭제된 사람은 "+ name + "입니다..");
		//첫번재 데이터를 아이유로 수정
		list.set(2, "아이유");
		//모든 정보 출력
		System.out.println(list);
		//list에 저장된 멤버들 중 서장훈 받아옴
//		int cnt =0;
//		for(String str : list) {
//			if (str.equals("서장훈")) System.out.println(list.get(cnt));
//			cnt++;
//		}
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals("서장훈")) System.out.println(list.get(i));
		}
	}

}
