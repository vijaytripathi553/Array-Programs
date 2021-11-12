package com.live.interview;


 *HAve the function ArrayChallenge(arr) take the array of numbers stored in arr and from the position in array where a 1 is, return the number of spacecs either left or right.
 * You must move to reach an enemy which is represented by a 2.
 * 
 * For example: If arr is [0,0,1,0,0,2,0,2] then your program should return 3 because the closest enemy (2) is 3 spaces away from the 1. The array will contain any number of 0's and 2's, but only a single 1. 
 * It may nt contain any 2's at all as well, where in that case your program should return a 0;
 * Example\
 * Input: new int[] {1,1,1,1,2,2,2}
 * Output: 4
 * 
 * 
 * Input: new int[] {2,0,0,0,2,2,1,0}
 * Output: 1
	 
	 
	 
	 
	 
	 

import java.util.Iterator;

public class AjayArrayChallenge1 
{

	private static void doCount(int array1[])
	{
		
		int count=1;
		for (int i = 0; i < array1.length; i++) 
		{
			if(array1[i]==1)
			{
				for (int j = i; j < array1.length; j++) {
					if(array1[j]==2)
					{
						count++;
					}
					else
					{
						continue;
					}
					
				}
				
			}
			
		}
		System.out.println(count);
	
	}
	
	// Main Method
	public static void main(String[] args) {
		
		int array1[]=new int[] {1,0,0,0,2,2,2};       //OUTPUT=2
		//int array1[]=new int[] {2,0,0,0,2,2,1,0};   //OUTPUT=1
		
		// Method call
		doCount(array1);
	}	
}
