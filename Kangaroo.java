package com.hackerrank.warmup;

import java.util.*;

public class Kangaroo {
	private static String kangaroo(int x1, int v1, int x2, int v2) {
		
		List<String> list1=new ArrayList<String>();
		//		 x1 = 0,  		 x2 = 4, 
		//		 v1 = 3,     	 v2 = 2;
		//       x1=4523		
		if( v1 <=10000 &&  v2 <=10000)
		{
		int countI = 0;
		for (int i = x1; i <= 10000; i = i + v1) 
		{
			countI++;
			int countJ = 0;
			for (int j = x2; j <= 10000; j = j + v2) 
			{
				countJ++;

				if (countI == countJ && i == j)
				{
					list1.add("YES");

				} 
				else 
				{
					list1.add("NO");
				}
				
			}
		}
		
		if(list1.contains("YES"))
		{
			return "YES";
		}
		else
		{
			return "NO";
		}
		}
		return null;
	}

	// Main Method
	public static void main(String[] args) {
		int x1 = 1113 , v1 = 612 , x2 = 1331 , v2 = 610;   // YES 4523 8092 9419 8076  1113 612 1331 610
		//int x1 = 0, v1 = 2, x2 = 5, v2 = 3;   // NO
		//int x1 = 0, v1 = 3, x2 = 4, v2 = 2;		// YES

		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);

	}
}
