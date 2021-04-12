package com.array_interview.programs;

public class DuplicateArray {
	public static int[] findDuplicate(int array1[]) {
		// outer for loop
		for (int i = 0; i < array1.length; i++) {
			// Inner for loop
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[j] == array1[i]) {
					System.out.println(array1[j]);
				}
			}
		}

		return array1;
	}

	// Main Method
	public static void main(String args[]) {
		int array1[] = { 25, 65, 82, 25, 36, 45, 82 };
		DuplicateArray.findDuplicate(array1);
	}

}
