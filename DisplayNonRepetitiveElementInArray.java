package com.array_interview.programs;

import java.util.Arrays;

public class DisplayNonRepetitiveElementInArray {
	private static int[] displayElementWithItsCount(int array1[]) {

		for (int i = 0; i < array1.length; i++) {
			int count = 1;
			Arrays.sort(array1); // Arrays.sort() method is used to sort the array element
			// System.out.println(array1[i]);
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[j] == array1[i]) {
					count++;
					//System.out.println(array1[j]);
					

				} 
			}
			if(count<=1)
			System.out.print(array1[i]+",");
			i+=(count-1);
		
		}
		return array1;
	}

	public static void main(String[] args) {
		int array1[] = { 10,10, 50, 60, 23, 10, 2, 1,25,63,2 };
		DisplayNonRepetitiveElementInArray.displayElementWithItsCount(array1);
	}
}
