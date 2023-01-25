package com.hackerrank.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarcsCakewalk {
	
	// Method to sort the element in ascending order
	private static int[] doSorting(int array1[])
	{
		int temp=0;
		for (int i = 0; i < array1.length; i++)    //[5,10,7]
		{
			for (int j = i+1; j < array1.length; j++)
			{
				if(array1[i]>array1[j])
				{
					temp=array1[i];
					array1[i]=array1[j];
					array1[j]=temp;
				}
				else
				{
					continue;
				}
				
			}
			
		}
		
		return array1;
	}
	// Main Method
	public static void main(String[] args) 
	{
		int  array1[]=new int[] {68,45,92,78,62};
		
		int result[]=doSorting(array1);
		System.out.println(Arrays.toString(result));
				
			
	}
}


OUTPUT:
[45, 62, 68, 78, 92]
