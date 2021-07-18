package com.encore.test;

public class HourglassNumberTest {
	public static void main(String[] args) {
		 //모래시계
		System.out.println("문제 2)");
		System.out.println();
		
	        int temp[][] = new int[6][6]; 
	                                   
	        int center = (int) 5/2 +1;
	        int k=0; 
	        int begin = 0; 
	        int end = 6; 

	        for(int row=1;row<=5;row++){           
	           
	            if(row<=center){ 
	            	begin = row;
	            	end = 6 - row;
	            }else{
	            	begin = 6 - row;
	            	end = row;
	                       
	            }
	            for(int col=begin;col<=end;col++){             
	                k ++;
	                temp[row][col] = k;
	            }              
	        }      
	       

	        for(int i = 1; i<temp.length;i++){        
	            for(int j =1; j< temp[i].length;j++){
	                if(temp[i][j] == 0) {
	                    System.out.print("   ");
	                }else{
	                    System.out.printf("%3d", temp[i][j]);
	                }              
	            }
	            System.out.println();
	        }      
	    }
	}