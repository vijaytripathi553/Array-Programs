package com.array_interview.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bitwise {
	/*
	 * private static int[] sayHello(int array1[]) { int s = 1;
	 * System.out.println("Stage:" + s); System.out.println("Array Length:" +
	 * array1.length); for (int i = 0; i < array1.length; i++) {
	 * Arrays.sort(array1); // To sort the array element for (int j = i + 1; j <
	 * array1.length - 1; j++) { if (array1[i] == array1[j]) { array1[i] = array1[i]
	 * * 1 + 1; array1[j] = array1[i] * 0; System.out.print(array1[i] + ","); }
	 * 
	 * } } return array1;
	 */
	// }
	private static int[] seprateRepetitiveElement(int array1[]) {
		for (int i = 0; i < array1.length; i++) {
			int count = 0;
			Arrays.sort(array1);
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					count++;
					

				} 
			}
			if (count > 1) {
				System.out.println(array1[i] + "->" + count);
				i += (count - 1);
			}
			

		}
		return array1;

	}

	// Main Method
	public static void main(String args[]) {
		int s = 1;
		int array1[] = { 1, 3, 3, 4, 1 };
		Bitwise.seprateRepetitiveElement(array1);
		// Bitwise.sayHello(array1);

	}

}