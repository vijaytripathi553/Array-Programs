package com.array_interview.programs;

import java.util.Arrays;

public class CountAndDisplayFrequencyOfEachElementInArray {

	private static int[] displayElementWithItsCount(int array1[]) {

		for (int i = 0; i < array1.length - 1; i++) {
			int count = 1;
			Arrays.sort(array1); // Arrays.sort() method is used to sort the array element
			// System.out.println(array1[i]);
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j]) { // 10 10 10 20 20 39 41 41 42
					count++;

				} else {

					break;

				}
			}
			if (count >= 1) {
				System.out.println(array1[i]+" ->"+" "+count);
				i += (count - 1);
			}
		}
		return array1;
	}

	public static void main(String[] args) {
		int array1[] = {90,30,70,6,50,80,40,60,100,30,20,70,30,40,20,10,90,2,1,6,40,1,3,40};
		CountAndDisplayFrequencyOfEachElementInArray.displayElementWithItsCount(array1);
	}
}
