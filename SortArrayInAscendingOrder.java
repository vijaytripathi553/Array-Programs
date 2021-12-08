package com.basicprogram.practice;
	import java.util.Arrays;

	public class SortArrayInAscendingOrder {
		// Main Method
		public static void main(String[] args) {
			// Created Array
			int array1[] = { 5, 3, 234, 1, 2 };
			// Method Call
			int result[]=sortArray(array1);
			System.out.println(Arrays.toString(result));
		}

	// Method to sort Array
		private static int[] sortArray(int[] array1) {
			// Iterating through every element of an array
			for (int i = 0; i < array1.length; i++)
			{
				//Arrays.sort(array1);
				for (int j = i; j < array1.length; j++) 
				{
					if(array1[i]>array1[j])   // If(array1[i] is grater then array1[j] then do swap the element
					{
						int temp=array1[i];
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

}
