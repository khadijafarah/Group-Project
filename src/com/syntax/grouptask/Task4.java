package com.syntax.grouptask;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //task 4
		//Create a 2D array of integers. 
		//Develop a program which will calculate the sum of  even and odd numbers for that array.
		
	   int[][] numbers= {
				{1,2,3,4},
				{5,6,7,8}
				};
		 
		int evensum=0;
		int oddsum=0;
		
		for(int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[0].length; j++) {
				if (numbers[i][j]%2==0) {
					evensum = evensum + numbers[i][j];
				}else {
					oddsum+=numbers[i][j];
				}
			}
		}
		
		System.out.println(evensum);
		System.out.println(oddsum);
          
		
	}

}
