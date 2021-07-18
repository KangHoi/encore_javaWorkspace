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
			System.out.println("�迭�� ��: " + sum);
		};//total
		
		public static void average() {
			int avg = 0;
			int sum = 0;
			for(int i =0; i<list.length; i++) {
				sum += list[i];
		}//for
			avg = sum / list.length;
			System.out.println("�迭�� ���: " + avg);
		}
			
		public static void minimum() {	
			int min = list[0];
			for(int i=0; i<list.length; i++) {
				if(min > list[i]) {
					min = list[i];
				}
			}
			System.out.println("�迭�� �ּҰ�: " + min);
		};
		public static void selectionSort() {	
			int temp = 0;
			for(int i=0; i<list.length-1;i++) {
				for(int j=0; j<list.length-1; j++) {
					if(list[j] > list[j+1]) {//�� ���� �� ������ ũ�ٸ�
						temp = list[j]; //1) �� ���� ������ ����
						list[j] = list[j+1]; //2)�� ���� �ռ��� �ٲ�
						list[j+1] = temp; //3) �� ���� ������ ���� swap�ܰ�
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
