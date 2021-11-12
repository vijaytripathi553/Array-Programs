// Rules for creating singelton class

/*1. create private static instance of the class and initialse it as null
2. create private constructor
3 create public static getObject or getInstance mathod and return class object
		

*/


public class Singelton {
	//create private static instance of the class and initialse it as null
	private static Singelton s=null;
	
	
	//create private constructor
	private Singelton()
	{
		
	}
	
	//
	public static Singleton getInstance()
	{
		if(s==null)
		{
			s=new Singelton();
			return s;
		}
		
	}
	public static void main(String[] args) {
		
		Demo s1=new Demo();
		Demo s2=new Demo();
		
		if(s1==s2)
		{
			System.out.println("Same Object");
		}
		else
		{
			System.out.println("Different Object");
		}
		
	}

}
