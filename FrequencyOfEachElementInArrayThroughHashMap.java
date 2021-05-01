package com.array_interview.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElementInArrayThroughHashMap {
	private static int[] displayNonRepetitiveElement(int array1[])
	{
		int count=0;
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int i=0; i<array1.length;i++)
		{
			count=1;
			Arrays.sort(array1);
			if(!map.containsKey(array1[i]))
			{
				count=1;
				map.put(array1[i],1);
			}
			else
			{
				count++;
				map.put(array1[i],map.get(array1[i])+1);   //hm.get(a[i])+1
			
			}
		}
		System.out.println(map);
  
		return array1;
	}
	public static void main(String args[])
	{
		int array1[]= {10,5,4,7,8,4,7,25,5,6,5,10,1,3}; //1,1,2,3,3,3,4,4,4,5,6
		FrequencyOfEachElementInArrayThroughHashMap.displayNonRepetitiveElement(array1);
	}
}
