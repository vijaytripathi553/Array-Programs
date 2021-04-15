package com.array_interview.programs;

public class DisplayNegativeElements {
	private static int [] findPositiveElements(int array1[])
	{
		for (int i = 0; i < array1.length; i++) {
			if(array1[i]<0)
			{
				System.out.print(array1[i]+" ");
			}
			
		}
		return array1;
	}
	//Main Method
	public static void main(String args[])
	{
		int array1[]= {20,-56,45,3,-78,7,-1};
		DisplayNegativeElements.findPositiveElements(array1);
	}

}
