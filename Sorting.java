package com.array_interview.programs;
//[13,43,45,76,78,98,90,50]
public class Sorting {
	
	private static void doSort(int array1[])
	{
		for (int i = 0; i < array1.length; i++) {
			for (int j = i+1; j < array1.length; j++) {
				if (array1[i]<array1[j]) 
				{
					int temp=array1[i];
					array1[i]=array1[j];
					array1[j]=temp;
					
				} 
				
				
			}
			System.out.print(array1[i]+",");
			
		}
	}
	
	public static void main(String[] args) {
		int array1[]= {13,43,45,76,78,98,90,50};
		
		doSort(array1);
	}

}
