package com.array_interview.programs;

public class MaxArray {
	private static int[] findMax(int array1[])
	{
		int max=array1[0];
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]>max)
			{
				max=array1[i];
			}
			
			
		}
		System.out.println(max);
		return array1;
	}

	public static void main(String[] args) {
		int array1[]= {450,85,65,28,45,78,95};
		MaxArray.findMax(array1);

	}

}
