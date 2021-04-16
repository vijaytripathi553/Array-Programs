package com.array_interview.programs;

import java.util.ArrayList;
import java.util.List;

public  class ShiftPositiveElementAtLastAndNegativeElementAtBegin {
	static List<Integer> al=new ArrayList<Integer>();
	
	
	private static int [] findNegativeElements(int array1[])
	{
		for (int i = 0; i < array1.length; i++) {
			if(array1[i]<0)
			{
				al.add(array1[i]);
				System.out.print(array1[i]+" ");
			}
			
		}
		return array1;
	}
	
	private static int [] findPositiveElements(int array1[])
	{
		for (int i = 0; i < array1.length; i++) {
			if(array1[i]>0)
			{
				al.add(array1[i]);
				System.out.print(array1[i]+" ");
			}
			
		}
		return array1;
	}
	
	//Main Method
	public static void main(String args[])
	{
		int array1[]= {20,-56,45,-34,89,11,3,-78,7,-1};
		ShiftPositiveElementAtLastAndNegativeElementAtBegin.findNegativeElements(array1);
		ShiftPositiveElementAtLastAndNegativeElementAtBegin.findPositiveElements(array1);
	
	}

}
