package com.encore.algo.test;

public class ArrayTest {
		public static int[] list = {34, 23, 64, 25, 12, 75, 22, 88, 53, 37};
		
		public static void print() {
			for(int i=0; i<list.length;i++) {
				System.out.print(list[i] + " ");
			}
		};
		
		
		public static void total() {
			int sum = 0;
			for(int i =0; i<list.length; i++) {
				sum += list[i];
			}//for
			System.out.print("\n");
			System.out.println("배열의 합: " + sum);
		};//total
		
		public static void average() {
			int avg = 0;
			int sum = 0;
			for(int i =0; i<list.length; i++) {
				sum += list[i];
		}//for
			avg = sum / list.length;
			System.out.println("배열의 평균: " + avg);
		}
			
		public static void minimum() {	
			int min = list[0];
			for(int i=0; i<list.length; i++) {
				if(min > list[i]) {
					min = list[i];
				}
			}
			System.out.println("배열의 최소값: " + min);
		};
		public static void selectionSort() {	
			int temp = 0;
			for(int i=0; i<list.length-1;i++) {
				for(int j=0; j<list.length-1; j++) {
					if(list[j] > list[j+1]) {//앞 수가 뒤 수보다 크다면
						temp = list[j]; //1) 앞 수를 템프에 넣음
						list[j] = list[j+1]; //2)뒷 수를 앞수로 바꿈
						list[j+1] = temp; //3) 뒷 수를 템프로 넣음 swap단계
					}//if	
				}//for
			}//outer for
		};
		
	public static void main(String[] args) {
		print();
		total();
		average();
		minimum();
		System.out.println("=== selection sort (Ascening Order) ===");
		selectionSort();
		print();		
	}

}
