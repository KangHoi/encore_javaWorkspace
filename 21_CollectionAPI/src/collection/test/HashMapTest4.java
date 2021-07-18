package collection.test;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 * Map의 자식 클래스... HashMap
 * key-value를 상으로 연결해서 데이터를 저장하는 특징 가짐
 * key는 중복 허용하지 않고 value는 중복 가능
 * 순서는 없다
 */

public class HashMapTest4 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("강호동", 90);
		map.put("이수근", 95);
		map.put("서장훈", 99);
		map.put("김희철", 80);
		
		//1. 키만 받아온다
		//2. 키를 돌면서
		//3. 키 값 뽑고
		//4. 키 값에 해당하는 점수 뽑고
		//5. 최종적으로 모든 성적의 합과 평균값 출력
		
		
		
		
		
		
		System.out.println("============ keyset() 사용 =================");
		Set<String> set = map.keySet();
		System.out.println(set);
		
		;

		Iterator<String> it = set.iterator();
		int total =0;
		while(it.hasNext()) { //hasmoreelements()
			String name = it.next();//hasNext()
			int score = map.get(name);
			total += score;
		}
		System.out.println("모든 학생 성적의 총합은 "+ total + "점입니다.");
		System.out.println("모든 학생 성적의 평균은 "+ total/map.size() + "점입니다.");
		
		
		System.out.println("============ entryset() 사용 ===============");
		System.out.println("============ values() ===============================");
		Collection<Integer> col = map.values(); //90,95,99,80
		Iterator<Integer> it2 = col.iterator();
		int sum =0;
		while(it2.hasNext()) {
			int jumsu = it2.next();
			sum += jumsu;
		}
		System.out.println("모든 학생 성적의 총합은 "+ sum + "점입니다.");
		System.out.println("모든 학생 성적의 평균은 "+ sum/map.size() + "점입니다.");
		
		System.out.println("최고성적은 "+ Collections.max(col) + "점입니다.");
		System.out.println("최저성적은 "+ Collections.min(col) + "점입니다.");
		
		}
	}


