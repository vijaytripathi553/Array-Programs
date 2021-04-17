package com.array_interview.programs;

import java.util.Scanner;

public class NumberToWord {

	private static int someThing(int n) {
		int rem=0;
		int rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			//System.out.println(rev);
		}

		while(rev>0)
		{
			
		switch (rev%10) {
		case 1:
			System.out.print("One"+" ");
			
			break;
		case 2:
			System.out.print("Two"+" ");
			
			break;
		case 3:
			System.out.print("Three"+" ");
			
			break;
		case 4:
			System.out.print("Four"+" ");
			
			break;
		case 5:
			System.out.print("Five"+" ");
			
			break;
		case 6:
			System.out.print("Six"+" ");
			
			break;
		case 7:
			System.out.print("Seven"+" ");
			
			break;
		case 8:
			System.out.print("Eight"+" ");
			
			break;
		case 9:
			System.out.print("Nine"+" ");
			
			break;
		

		default:
			System.out.print("Wrong Selection");
			break;
		}
		rev=rev/10;
		
		}
		
		
		return n;
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any No");
		int n = sc.nextInt();

		// TODO Auto-generated method stub
		NumberToWord.someThing(n);

	}

}
