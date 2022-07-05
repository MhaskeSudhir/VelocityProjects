package logicalprograms;

public class Swaping {

	public static void main(String[] args) {
		
		int a=10,b=20;
		
		//logic 1 BY USING THIRD VARIABLE
		//int c=b;
		//b=a;
		//a=c;
		System.out.println("AFTER SWAPING LOGIC 1 a = "+a+" b = "+b);

		//logic 2 using + and - operator --------WITHOUT THIRD VARIABLE
		
		//a=a+b;
		//b=a-b;
		//a=a-b;
		//System.out.println("AFTER SWAPING LOGIC 2 a = "+a+" b = "+b);
		
		//logic 3 using * and / operator--------WITHOUT THIRD VARIABLE
		//a=a*b;
		//b=a/b;
		//a=a/b;
		//System.out.println("AFTER SWAPING LOGIC 3 a = "+a+" b = "+b);
		
		//logic 4 using only single statement
		
		//b=a+b-(a=b);
		//System.out.println("AFTER SWAPING LOGIC 3 a = "+a+" b = "+b);
		
		//logic 5 using xor operator
		
		//a=a^b;
		//b=a^b;
		//a=a^b;
		//System.out.println("AFTER SWAPING LOGIC 3 a = "+a+" b = "+b);
	}

}
