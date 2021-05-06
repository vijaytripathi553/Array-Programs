package com.array_interview.programs;
// Check whether array contains consecutive element or not. If array contains consecutive element then display 1 else display 0.

import java.util.Arrays;

public class Allinze {
	public static int[] checkSorting(int array1[]) {
		int count=0;
		int k=0;
		for (int i = 0; i < array1.length-1; i++) {
			
			Arrays.sort(array1);
			 k=array1[i+1]-array1[i];
			if(array1[i+1]-array1[i]==1)
			{
				count++;			
			}
			else
			{
				break;
			}
			
		}
		if(k==1)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		
		return array1;
	}

	public static void main(String args[]) {
		int array1[] = {5,9,3,4,7,1,2};  // 1 2 3 4 5
		Allinze.checkSorting(array1);
	}

}
