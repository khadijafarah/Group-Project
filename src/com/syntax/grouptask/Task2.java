package com.syntax.grouptask;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //task 2
		//Create a 2D array of integer values. Print the sum of all numbers.
		
    int[][] numbers= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		 
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[0].length; j++) {
				sum+=numbers[i][j];
			}
			}
          System.out.println(sum);
		
	}

}
