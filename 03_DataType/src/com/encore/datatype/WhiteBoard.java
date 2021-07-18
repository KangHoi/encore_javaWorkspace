package com.encore.datatype;

/*
 * 1. 필드
 * 	  int 사이즈, char 컬러, float 가격, String 제조 회사, String 재질
 *    스크래치 여부를 알 수 있는 필드 추가
 * 
 * 2. 메소드
 *    2개 정의
 *    - 값을 Test 클래스에서 받아서 필드에 입력하는 기능
 *    - 필드에 입력된, 저장된 값을 콘솔창으로 출력하는 기능
 *    
 *  1. 변수 (Variable은 사용되는 위치에 따라 범위가 지정되고 Field와 Local 변수로 구분된다)
 *     필드 --> 클래스 선언 바로 밑, 메소드 block 바깥
 *     local 변수(지역 변수) --> 메소드 안에서 선언
 *  2. 
 */
public class WhiteBoard {
	public int size;
	public char color;
	public float price;
	public String company;
	public String material;
	public boolean scratch;//멤버변수(클래스 전체에서 사용)
	
	public void setInfo(int size, char color, float price, String company, String material, boolean scratch){
		//필드와 로컬변수의 이름이 같을 때, 구분하기 위해 필드 앞 this 붙인다.
		//this는 해당 클래스 자기 자식..쯤으로 해석
		this.size = size;
		this.color = color;
		this.price = price;
		this.company = company;
		this.material = material;
		this.scratch = scratch;//로컬변수(해당 지역에서만 사용)
	}
	
	
	public void printInfo() {
		System.out.println(size+"\t"+color+"\t"+price+"\t"+company +"\t"+ material+"\t"+scratch);
		
	}

}
