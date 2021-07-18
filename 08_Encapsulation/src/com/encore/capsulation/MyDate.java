package com.encore.capsulation;


/*
 * Encapsulation Pattern
 * 1. 다른 클래스에서 직접적으로 접근할 수 없도록
 * 		필드 앞에 ----> private 지정한다.
 * 2. 클래스의 필드에 접근은 setter() / getter() 한다
 * 	  그리고 getter와 setter가 다른 클래스에서도 서로 접근할 수 있도록 public
 * 	  public void setXxx(o)
 * 	  public int getXxx(x)
 * 3. 
 * 	 setXxx(){
 *   // 첫 라인에서 (필드 초기화 되기 직전!!)에 타당한 값만 받을 수 있도록 로직 제어
 *   
 *   
 *   setDay()
 *   ::
 *   1,3,5,7,8,10,12월 ---> 1<= day <=31
 *   2월 ---> 1<= day <=28
 *   4,6,9,11월 ---> 1<= day <=30
 *   switch, if
 *   
 *   ::
 *   출력 결과에 0 나오지 않도록! 
 * 
 * 
 */

public class MyDate {
	//private 지정하면 같은 클래스에서만 접근을 허용한다.
	private int month;
	private int day;
	
	public int getMonth() {
		return month;
		}
		
	public void setMonth(int month) {
		//제어문 1~12월에 해당하는 값만 처리...
		if(1<=month && month<=12) {
			this.month = month;}
		else {
			System.out.println("Invalid Month Value!!!");
			//return;// 오류일 경우 값을 다시 입력하도록
			System.exit(0);}
		}
	
	public int getDay() {
		return day;}
		
	
	public void setDay(int day) {
		//월에 따라 day가 달라진다...
		switch(month) {
			case 2:
				if(1<=day & day<=28) {
					this.day = day;}
				else {System.out.println("Invalid Day Vlue!!");
						System.exit(0);}
			break;
			
			case 4:
			case 6:
			case 9:
			case 11:
				if(1<=day & day<=30) {
					this.day = day;} 
				else {System.out.println("Invalid Day Vlue!!");
						System.exit(0);}
			break;
			
			default:
				if(1<=day && day<=31) {
					this.day =day;}
				else {System.out.println("Invalid Day Value!!");
						System.exit(0);}//초기값인 0으로 받지 않음
				
				break;
			}
			
		}
	}

