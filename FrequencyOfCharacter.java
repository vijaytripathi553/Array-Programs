package com.array_interview.programs;

import java.util.Arrays;

public class FrequencyOfCharacter {
	private static String m1(String s) {

		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				} else {
					break;
				}
			}
			if (count >= 1) {
				System.out.println(arr[i] + " ->" + count + " ");
				
				i += (count - 1);
			}
		}
		return s;
	}
	public static void main(String[] args) {
		String s = "aaabcacdb";
		FrequencyOfCharacter.m1(s);

	}

}
