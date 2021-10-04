package com.array_interview.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable
{
	// Data member or attributes of Student class
	private int rollNo;
	private String firstName;
	private String email;
	private String address;
	
	// Constructor of Student class
	public Student(int rollNo, String firstName, String email, String address) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.email = email;
		this.address = address;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", email=" + email + ", address=" + address
				+ "]";
	}





	@Override
	public int compareTo(Object o) {  // Within the parenthesis of a CompareTo() method we have (Object a) because Comparable interface in compareTo method
		Student st=(Student)o;
		return Integer.compare(this.rollNo,st.rollNo);
		
	}
	
	

	
	
	
	
}


public class StudentComparableInterface {
	// Main Method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Creating a list of student
		List<Student> al=new ArrayList<Student>();
		
		int roll=0;
		String firstName="";
		String email="";
		String address="";
		
		System.out.println("How many student records you want to have");
		int n=sc.nextInt();
		
		System.out.println("Please Enter"+ n+ "Student details:");
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Roll No:");
			 roll=sc.nextInt();
			
			System.out.println("Enter First Name");
			 firstName=sc.next();
			
			System.out.println("Enter Email");
			 email=sc.next();
			
			System.out.println("Enter Address");
			 address=sc.next();
			
		}
		Student student=new Student(roll,firstName,email,address);
		al.add(student);
		System.out.println(al);
		
		
	}
	

}
