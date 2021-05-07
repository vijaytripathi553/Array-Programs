package com.array_interview.programs;
// Progrm to display the difference between Max and Min element of an array


public class TechM_Intern {
	public static int findDiffBetweenMinAndMaxArray(int array1[])
	{
		int max=array1[0];
		int min=array1[0];
		for (int i = 0; i < array1.length; i++) {
			if(array1[i]>=max)
			{
				max=array1[i];
				continue;
			}
			else if(array1[i]<=min)
			{
				min=array1[i];
			}
		}
		//System.out.println("Max Element is:"+" "+max);
		//System.out.println("Min Element is:"+min);
		return max-min;
	}
	// Main Method
	public static void main(String args[])
	{
		int array1[]= {7,5,4,6,8,4,7,14};
		int total=TechM_Intern.findDiffBetweenMinAndMaxArray(array1);
		System.out.println(total);
		
	}

}
      
