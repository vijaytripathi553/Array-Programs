package com.live.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/* ***************************************************************************************************
 * Reference :https://www.scaler.com/topics/toarray-in-java/
 
 * The toArray() method of the ArrayList is used to convert the ArrayList to an array and return it.
 
 * This function either takes in no parameter or takes in an array of Type T(T[] a) in which the element of the list will be stored.
 
 * The toArray() function always returns an object array(Object[]) if the parameter is not passed. Otherwise, if the parameter is passed, it returns an array of Type T(T[]).
 * 
 *****************************************************************************************************/



public class ToArrayMethodWithoutParameter {
	 public static void main(String[] args) 
	 {
	      ArrayList<String> lang = new ArrayList<>();
	      lang.add("JavaScript");
	      lang.add("Java");
	      lang.add("C++");
	      lang.add("Python");

	    //converting arraylist to array
	      Object[] obj=lang.toArray();     // Without Passing any Parameter to toArray() method. It return object[] array
	      
	      System.out.println(Arrays.toString(obj));

	  

	   }

}
