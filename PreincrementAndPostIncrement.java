package com.live.interview;

// Pre-increment  :  In pre-increment, first value is incremented by 1 and then it is assigned.

// Post-increment : In post-increment, first value is assigned and then it is incremented by 1.

public class PreincrementAndPostincrement {
	public static void main(String[] args) {
		int a=1,b=2,c,d;
		c=++b; //3  b=b+1    First b is getting incremented then it is assigned to c
		d=a++;  //2      First it is assigned  to d then it is incremented by 1.
		c++; //4  c was 3 now again it is incremented by 1. 
		b++;//4  c was 3 now after increment by 1 it became 4
		++a;//3   Earlier a was 2 but first it is incremented so it became 4
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}


OUTPUT
3
4
4
