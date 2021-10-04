package com.array_interview.programs;

import java.util.Arrays;

public class DisplayMaximumNumberTimesOccuredElementInArray {

	private static void sayHello(int array1[]) {
		int count = 0;
		int maxOccured = 0;
		int element = 0;
		for (int i = 0; i < array1.length; i++) {
			Arrays.sort(array1);
			

			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					count++;

				}

			}
			if (maxOccured < count) {
				maxOccured = count;
				element = array1[i];
				//System.out.println(element + "->" + count);

				//i += (count - 1);
			}
			System.out.println(element + "->" + count);

		}
		

	}

	// Main Method
	public static void main(String args[]) {
		int array1[] = { 1, 2, 3, 4, 5,2, 6, 2, 3, 1,2, 3, 8, 7, 3, 2 };
		DisplayMaximumNumberTimesOccuredElementInArray.sayHello(array1);

	}

}
