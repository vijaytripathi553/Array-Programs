package com.live.interview;
import java.util.Arrays;

/* ✅ In this Program Will convert an int array (array1) to int
 *   INPUT :[100,200,300,400]
 *   OUTPUT:100200300400
 *   
 *   Approach :
 * STEP 1:   In order to convert an Integer array to int first let's convert an int array to String with the help of Arrays.toString().  Same could have been done by using for loop and adding each element to the list by + or concat() method.
 * STEP 2: After Converting the Array to String, now we can convert this String to int.
 */

public class HowToConvertIntegerArrayToInteger {
	
// Method to Convert an integer array to integer
	private static int convertAnIntegerArrayToInteger(int[] array1) 
	{
		
		String ans=Arrays.toString(array1);
		System.out.println("Converted an Integer Array to String and here is array:"+ans);
		
		System.out.println("👍🏻 Now, lets remove the comma from the string");
		ans=ans.replaceAll("\\D", "");  // Here, //D is nothing but metacharcter which is used to remove the Non-digit characters
		System.out.println("After removing comma from the string:"+ans);
		System.out.println("👌 Ultimately, Let's convert this string to integer and return it");
		
		int fromStringToInt=0;
		// Below code is to handle the NumberFormatException which occurs when we try to convert string to Integer (Other then No). Other then No in the sense String s1="123"  can be converted to integer but String s2="Vijay" will raise NumberFormatException.
		try
		{
		//	It is a best practice to check if the passed-in string is numeric or not before trying to convert it to integer.
		// For tht i have created one method to check whether it is numeric
			boolean checkNumeric=isNumeric(ans);
			
			fromStringToInt=Integer.valueOf(ans); 	// String s1="123" will be converted to String . 
		}
		catch(NumberFormatException nfe)
		{
			nfe.printStackTrace();  // This is the method coming from Throwable class which tells you what happened and where in the code this happened.
			
			if(ans==null || ans.isEmpty())       // To check whether string is empty or not
			{
				System.out.println("Your String is null or your input is string:");
			}
			else if(ans.matches("^[a-zA-z]*$"))  // To check whether string contains alphanumeric character
			{
				System.out.println("Your string contains alphanuanric chacter which causes NumberFormatException");
			}
			//else if()
			/*
			 * else { return fromStringToInt; }
			 */
			
		}
	
		return fromStringToInt;
	}
	
	
	// Method to check whether string contains numeric or not
	
	private static boolean isNumeric(String ans)
	{
		// Using String matchers() method will check whether it contains numeric or not
		if(ans.matches("[0-9.]+"))
		{
			return true;
		}
		else
			return false;
		
	}
	
	// Main Method
	public static void main(String[] args) {
		int array1[]=new int[] {100,200,300};
		
		int result=convertAnIntegerArrayToInteger(array1);
		System.out.println(result);
		
	}


}
