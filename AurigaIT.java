package com.array_interview.programs;
//AMCAT Test
// WAP which will return the count of special character involved in a particular string.

//Input: ab@df548 m d&g#^^
// Output: 5 because it contains 5 special character

public class AurigaIT {
	private static int countSpecialCharacter(String s)
	{
		int answer=0;
		int letter=0;
		int digit=0;
		int space=0;
		
		char ch[]=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i]))
			{
			//	System.out.print(ch[i]);            To print only digits
				digit++;
				
			}
			else if(Character.isLetter(ch[i]))
			{
				// System.out.print(ch[i]);         To print only alphabets
				letter++;
			}
			else if(Character.isSpaceChar(ch[i]))     
			{
				space++;
			}
			else
			{
				answer++;
			}
			
		}
		
		return answer;
	}
	public static void main(String args[])
	{
		String s="ab@df548 m d&g#^^";
		int count= AurigaIT.countSpecialCharacter(s);	
		System.out.println(count);
	}

}
