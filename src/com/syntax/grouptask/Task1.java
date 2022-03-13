package com.syntax.grouptask;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		
		
	  //task1
	 //Create an array on Int values using a scanner and 
	//calculate the sum of all stored elements in that array.
		
		Scanner scan=new Scanner(System.in);
		int sum=0;
		
		System.out.println("Enter the size of the array:");
		int n = scan.nextInt();
		int[] num = new int[n];
		
		System.out.print("Please enter int numbers to create an array");
		for(int i=0; i < num.length; i++) {
			num[i] = scan.nextInt();
			sum+=num[i];
		}
	    System.out.print("Sum of all elements: " + sum);
	}

}
