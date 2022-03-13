package com.syntax.grouptask;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //task 3
		 //Create a 2D array or integer type where you will store odd and even numbers. 
		//Develop a program which will identify/print the even numbers only.
		
		int[][] numbers= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		 
		for(int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[0].length; j++) {
				if (numbers[i][j]%2==0) {
					System.out.println(numbers[i][j]);
				}
			}
		}	
	}
}
