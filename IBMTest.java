package com.array_interview.programs;

import java.util.Scanner;

public class IBMTest {
	private static int loanEligibilityCal(String empType, int age, int salary, int loanTerm) {
	
		if((empType=="salaried" || empType=="self-employed"))
		{
			System.out.println("Eligible");
			if((age==21 || age<=58) && (salary==180000 || salary>=300000))
			{
				System.out.println("Eligible");
				if((loanTerm<=30)&& (age+loanTerm<=58))
				{
					System.out.println("Eligible");
				}
			}
			
			
		
		}
		else
		{
			System.out.println("Not Eligible");
		}
		
		return 1;
			
		}

	// Main Method
	public static void main(String args[]) {/*
											 * Scanner sc=new Scanner(System.in); String empType=sc.next(); int
											 * age=sc.nextInt(); int salary=sc.nextInt(); int loanTerm=sc.nextInt();
											 */

		String empType = "not";
		int age = 32;
		int salary = 180000;
		int loanTerm = 20;
		int total=IBMTest.loanEligibilityCal(empType, age, salary, loanTerm);
		System.out.println(total);
		

	}

}
