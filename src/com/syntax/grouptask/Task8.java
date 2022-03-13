package com.syntax.grouptask;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//maximum and the minimum number in the array?
		
				int[] arr= {10,20,90,50,70};
				
				int largest=arr[0]; //assuming 1st num is the largest
				int smallest=arr[0];//assuming 1st num is the smallest
				for(int elements:arr) {
				
					if(elements>largest) {  
						largest=elements;
					}
					
					if(elements<smallest) {
						smallest=elements;
					}
					
					
				}
				
				System.out.println("Largest number is "+largest);
				System.out.println("Smallest number is "+smallest);
				
				

			}

	}


