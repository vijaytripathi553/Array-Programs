package com.array_interview.programs;

//  Given the first 2 terms A and B of an Arithmetic Series, tell the Nth term of the series.
// Input: 2 3 10
// Output: 11


//Input: 1 2 5
//Output: 5
public class Newton_Assign1 {
	private static int tellNthTermOfSeries(int a,int b,int n)
	{
		int diff=b-a;
		return a+(n-1)*diff;
	}
	public static void main(String args[])
	{
		int a=1,b=2,n=5;
		
		System.out.println(Newton_Assign1.tellNthTermOfSeries(a, b, n));
		
		
	}

}
