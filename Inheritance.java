package com.array_interview.programs;


 class A
{
	/*
	 * A() { System.out.println("This is parent class default constructor"); }
	 */
	 void m1()
	 {
		 System.out.println("m1 from A");
		 
	 }
	
}
 
 
 class B extends A
 {
		/*
		 * B() { System.out.println("Child class defulat constructor"); }
		 */
	 void m1()
	 {
		 System.out.println("m1 from B");
		 
	 }
 }
public class Inheritance {
	public static void main(String[] args) {
		A a=new B();  // Here derived class m1 method will be called beacause  we are creating the object of derived class with the reference of base class.
		a.m1();       // So, in short it is similar to   B b=new B();
		
		//B b=(A) a;
		a=new A();      // Now the advantage of base class reference variable is now with the same object we can call the base class m1() method.
		//a=(A)new A();
		a.m1();
		
		
	//	B b=new B();
	//	b.m1();
		
	}
	

}
