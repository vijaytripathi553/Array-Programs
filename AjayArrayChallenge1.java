package com.live.interview;

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
