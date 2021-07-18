package array.test;
/*
 * int 타입의 배열을 만든다... 랜덤한 값의 정수를 집어 넣는다.
 * 여러 숫자들 중 가장 큰 수와 가장 작은 수를 찾아내는 알고리즘을 작성..
 */

public class ArrayMaxAndMinTest3 {

	public static void main(String[] args) {
		
		int[ ] scores = {79, 88, 91, 44, 99, 55, 96};
		
		int min = scores[0]; //배열의 첫 번째 값으로 기본값을 초기화한다... 79
		int max = scores[0]; //...79
		
//		for(int i =1; i<scores.length; i++) {//0~6까지 반복
//			if(scores[i]<min) min = scores[i];
//			if(scores[i]>max) max = scores[i];
//			
//		}
		
		//Advanced For문(For Each구문)... "뭐가 어디에서 도는가??"
		for( int score : scores) {//scores라는 배열에서 처음부터 하나씩 할당받아서 score에 들어감.
			if(score<min) min = score;
			if(score>max) max = score;
		}
		
		
		
		
		System.out.println("최솟값: " + min); //44
		System.out.println("최솟값: " + max); //99
		

	}//main

}
