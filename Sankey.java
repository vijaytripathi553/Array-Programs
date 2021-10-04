package com.array_interview.programs;

/*
Q.
The two detective agents who are working on a secret mission wants to communicate in code language with each other.
 They decided below some rules for encoding a message .
  The first word should be changed as all vowels should be replaced by % .
  The second word should be changed like all consonants should be replaced by # .
  The third word should be changed like all char should be converted to upper case.
   All 3 letters concatenate together .
You need to write a program to encode a message into a code language according to rules.
*/
import java.util.*;
class Sankey
{
	
	private static void doEncode(String s1,String s2,String s3)
	{
		//String s1Array[]=s1.split("");
		char s1Array[]=s1.toCharArray();
		
		//1st
		for (int i = 0; i < s1Array.length; i++) {
			
			if(s1Array[i]=='a'|| s1Array[i]=='e'||s1Array[i]=='i' || s1Array[i]=='o'||s1Array[i]=='u')
			{
				s1Array[i]='%';
				
			}
			System.out.print(s1Array[i]);
			
			
		}
		
		
		//2nd
		char s2Array[]=s2.toCharArray();
		for (int j = 0; j < s2Array.length; j++) {
			
			if(!(s2Array[j]=='a'|| s2Array[j]=='e'||s2Array[j]=='i' || s2Array[j]=='o'||s2Array[j]=='u'))
			{
				s2Array[j]='#';
				
			}
			System.out.print(s2Array[j]);
			
			
		}
		//3rd
		s3=s3.toUpperCase();
		System.out.print(s3);
		
		
		
		
		
		
		//return s1Array[i]s2Array[i]+s3;
	}
	// Main Method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		
		doEncode(s1,s2,s3);
		
		
	}
}