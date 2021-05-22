Refer below link for question
//https://nebuyeynztcxhcky.quora.com/PresisKonsult-Round-1-Online-Java-Assessment-Senior-Programmer-role-Question-Solution-code-import-java-io

package com.live.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner; 
 
interface OnlineAccount { 
	int basePrice = 120; 
	int regularMoviePrice = 45; 
	int exclusiveMoviePrice = 80; 
} 
  class Account implements OnlineAccount, Comparable<Account> { 
	int noOfRegularMovies, noOfExclusiveMovies; 
	String ownerName; 
 
	public Account(String owner, int regMovies, int exclMovies) { 
		this.ownerName = owner; 
		this.noOfRegularMovies = regMovies; 
		this.noOfExclusiveMovies = exclMovies; 
	
	}


	public int monthlyCost() { 
		System.out.println(basePrice + noOfRegularMovies * regularMoviePrice + noOfExclusiveMovies * exclusiveMoviePrice);
		return basePrice + noOfRegularMovies * regularMoviePrice + noOfExclusiveMovies * exclusiveMoviePrice; 
	} 
	
	@Override 
	public int compareTo(Account act) { 
		/*
		 * int result=0;
		 * 
		 * double thiscost=0,accost=0; thiscost=this.monthlyCost();
		 * accost=act.monthlyCost(); if(thiscost<accost) result=-1; else
		 * if(thiscost==accost) result=0; else result=1;
		 */
		
		return Integer.compare(this.monthlyCost(),act.monthlyCost());
		
		
	}
	
	// Tostring method
 
	public String toString() { 
		return "Owner is " + ownerName + " and monthly cost is " + this.monthlyCost() + " USD."; 
	}
} 
	
 
public class VirtusaOnlineAccountInterface { 
	public static void main(String [] args) { 
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter total no of test cases:");
		int totalTestCase=sc.nextInt();
		System.out.println("Enter"+""+totalTestCase+"");
		
		
		String owner="";
		int regMovie=0;
		int excMovie=0;
		
		//Account a=new Account(owner, regMovie, excMovie);
		
		List<Account> list=new ArrayList<Account>();
		for (int i = 0; i < totalTestCase; i++) {
			System.out.println("Enter Owner");
		    owner=sc.next();
			System.out.println("Enter Reg Movie");
			 regMovie=sc.nextInt();
			System.out.println("Enter Exc Movie");
		     excMovie=sc.nextInt();
		     
		   //  Storing Sting and Integer types of value and constructorn calling
		     list.add(new Account(owner,regMovie,excMovie));
		     
			
		}
		Collections.sort(list);
		System.out.println("Most valuable account details:"); 
		System.out.println(list.get(list.size()-1)); 
		
	
	} 
} 
