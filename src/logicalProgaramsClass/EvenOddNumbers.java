package logicalProgaramsClass;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int base=2;
		
		// num/base----Division Operator---gives division result
		// num%base---Modular Operator---gives Remainder result
		// for even number num%base will be zero
		
//		if(num%2==0)
//		{
//			System.out.println("Number "+num+" is Even Number!");
//		}
//		else
//		{
//			System.out.println("Number "+num+" is Odd Number!");
//		}
		
		if((num/2)*2==num)
		{
			System.out.println("Number "+num+" is Even Number!");
		}
		else
		{
			System.out.println("Number "+num+" is Odd Number!");
		}
	
	}

}
