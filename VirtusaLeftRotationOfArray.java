package com.live.interview;
//...............................................................................................
//Virtusa Coding Question 1:

/*
 * 🔴 Playing with Numbers Ryan is glven an array of random Integers of size n, a number d is provided to him along with this array.
 *  He needs to develop a logic such that it shifts the given array elements by d positions towards the left.
 *  
 *  
 *   Write a function for him and return the updated array.
 *    
 *   Input Specification: 
 *   
 *  ✔ Input1: An integer nl.e., size of the array
 *  ✔ input2: Integer array which are elements of the array 
 *  ✔ Input3: Integer d Output Specification: Return the updated array after the shift.
 *    
 *  🔴 Example 1:
 *   
 *    Inputs: 7 
 *    input2: (1,2,3,4,5,6,7) 
 *    input3:2
 *    
 *    Output: (3,4,5,6,7,1,2)
 *   
 *  Explanation: For the given d, i.e. 2 for above case each element is shifted by 2 places to left, and the Initial 2 elements are required to be shifted from behind, hence array is being rotated.
 *    
 * 🔴 Example 2: 
 * input1: 9 
 */
//...............................................................................................
import java.util.*;
public class VirtusaLeftRotationOfArray {
	
	
	private static List<Integer> doLeftRotate(int[] array1,int index) 
	{
		
		List<Integer> list=new ArrayList<>();
		
		int arrayLength=array1.length;
		for (int i = 2; i < array1.length; i++) 
		{
			list.add(array1[i]);
			
			//System.out.println(array1[i]+",");
			int a[] =new int []{array1[i]};
			if(i==arrayLength-1)
			{
				for (int j = 0; j < index; j++) 
				{
					//System.out.println(array1[j]+",");
					list.add(array1[j]);
					int b[]=new int[] {array1[j]};
				}
			}
			
			
			}
		return list;
	}
	
	// Main Method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//int sizeOfArray=5;
		int array1[]=new int[] {1,2,3,4,5,6};
		
		System.out.println("Enter the index no from where you want to rotate element towards left:");
		int index=2;
		
		// Shortcut  ctrl+1 and Then Enter
	List<Integer> result=doLeftRotate(array1,index);
	System.out.println(result);
		
		
		
		
	}

	

	

}
