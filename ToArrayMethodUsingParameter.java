package com.live.interview;

import java.util.ArrayList;
import java.util.Arrays;


/* ***************************************************************************************************
 * Reference :https://www.scaler.com/topics/toarray-in-java/
 
 * The toArray() method of the ArrayList is used to convert the ArrayList to an array and return it.
 
 * This function either takes in no parameter or takes in an array of Type T(T[] a) in which the element of the list will be stored.
 
 * The toArray() function always returns an object array(Object[]) if the parameter is not passed. Otherwise, if the parameter is passed, it returns an array of Type T(T[]).
 * 
 *****************************************************************************************************/

public class ToArrayMethodUsingParameter {
	// Main Method
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();

		for (int i = 1; i < 100; i += 15) {
			l.add(i);
		}
		// we have added elements in the ArrayList

		// we are creating an array of type Integer
		// and declaring its size same as arraylist
		Integer[] arr = new Integer[l.size()];

		// convert arraylist to array
		Integer[] newarr = l.toArray(arr);          // By Passing parameter to toArray()
		System.out.println(Arrays.toString(newarr));

		

	}

}
