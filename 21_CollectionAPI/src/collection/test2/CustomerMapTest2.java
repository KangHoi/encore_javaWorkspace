package collection.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import collection.vo.Customer;

public class CustomerMapTest2 {

	public static void main(String[] args) {
		HashMap<String, Customer> map = new HashMap<String,Customer>();
		
		map.put("111", new Customer("KANG", "강호동", 48));
		map.put("222", new Customer("LEE", "이수근", 44));
		map.put("333", new Customer("SEO", "서장훈", 42));
		map.put("444", new Customer("KIM", "김희철", 37));
		
		
		//1. Key값이 222인 사람 정보 출력
		System.out.println(map.get("222"));
		
		//2. id가 Lee인 사람 찾아 그 사람 이름 출력
		Set<String> set= map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			Customer c = map.get(it.next());
			if(c.getId().equals("LEE")) System.out.println(c.getName());
		}
		//3. MAP에 저장된 데이터의 모든 KEY 값 출력
		System.out.println(map.keySet());
		//4. MAP에 저장된 사람들 나이의 총합과 평균 연령 출력
		Set<String> keys = map.keySet();
		int totalAge = 0;
		for(String s : keys) {
			totalAge += map.get(s).getAge();
		}
		System.out.println("연령의 총합: " + totalAge + "세");
		System.out.println("평균 연령: " + totalAge/map.size() + "세");
	}

}
