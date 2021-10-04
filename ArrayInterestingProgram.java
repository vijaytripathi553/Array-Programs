package com.array_interview.programs;

public class ArrayInterestingProgram {
	public static int[] test1(int array1[],int array2[]) {
		int count1=0;
		int count2=0;
		
		for (int i = 0; i < array1.length; i=i+2) {
				System.out.println(array1[i]);
				
				
			count1=1;
				//count=count+1;
			for (int j = i; j < array2.length && array2.length< array1.length; j++) {
				
				
			}
		}
		return array1;
		
	}
	public static void main(String args[])
	{
		int array1[]= {1,2,3,4,5,6,7,8,9};
		int array2[]= {11,12,13,14,15,16,17,18,19};
		ArrayInterestingProgram.test1(array1,array2);
	}

}
