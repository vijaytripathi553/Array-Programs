package com.array_interview.programs;

import java.util.Arrays;

public class Demo {
	private static int[] sayHello(int array1[]) {
		
		for (int i = 0; i <array1.length; i++) {
			int count = 1;
			Arrays.sort(array1);
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[j] == array1[i])
				{
					
					count++;
					 //System.out.println(array1[i]+","+count);
				}
			}
			if(count>=1)
			{
				System.out.println(array1[i]+"- >"+count);
				i+=(count-1);
			}

		}
		return array1;
	}

	public static void main(String args[]) {
		int array1[] = {10,50,60,23,10,2,1,2};
		//Arrays.sort(array1);
		Demo.sayHello(array1);

	}

}