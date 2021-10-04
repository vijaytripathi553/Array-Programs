package com.array_interview.programs;

import java.util.Arrays;

public class FindMaximuNumberOfTimesRepeatedElementInArray {
	
	public static void findingMaxRepeated(int array1[])
	{
		int count=1;
		for (int i = 0; i < array1.length; i++) {
			Arrays.sort(array1);
			for (int j = i+1; j < array1.length-1; j++) {
				if(array1[i]==array1[j])
				{
					count++;
					
				}
				else
				{
					break;
				}
				
			}
			if(count>1)
			{
				System.out.print(array1[i]+"- >"+count+" ");
				i+=(count-1);
			}
			
		}
		
		
	//	int maxOccured=array1[0];
		for(int i=0; i<array1.length;i++)
		{
			if(array1[i]>count)
			{
				System.out.println(array1[i]+"="+count+" ");
				i+=(count-1);
			}
		}
		
	}
	public static void main(String args[])
	{
		int array1[]=new int[] {12,45,85,46,87,52,1,2,8,4,5,12,45,12};
		FindMaximuNumberOfTimesRepeatedElementInArray.findingMaxRepeated(array1);
		
	}

}

