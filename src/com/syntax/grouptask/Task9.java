package com.syntax.grouptask;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//largest number
				//second largest number
				
		        int[] arr= {10,20,90,50,70};
				
				int largest=Integer.MIN_VALUE;
				int secondLargest=Integer.MIN_VALUE;
				
				for(int elements:arr) {
				
					if(elements>largest) {  
						secondLargest=largest;
						largest=elements;
					}else if(elements>secondLargest && elements!=largest) {
						secondLargest=elements;
					}
				}
				
				System.out.println("Largest "+largest);
				System.out.println("Second Largest "+secondLargest);
				

			}




			



	

}
