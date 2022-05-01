package com.hackerrank.warmup;

import java.util.Arrays;

public class SortArray {
	
	// 1st Approach to sort the array element in Descending Order 
	private static int[] sort(int[] array1) 
	{
		for(int i=0; i<array1.length; i++)
		{
			for(int j=i+1; j<array1.length; j++)
			{
				if(array1[i]>array1[j])
				{
					int temp=array1[i];
					array1[i]=array1[j];
					array1[j]=temp;
				}
			}
		}
		return array1;
	}

	
	// Main method
	public static void main(String[] args) {
		int array1[]=new int[] {10,30,50,20,40};
		
		int result[]=sort(array1);
		System.out.println(Arrays.toString(result));
	}


}
