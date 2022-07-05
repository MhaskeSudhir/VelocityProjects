package logicalProgaramsClass;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//adding first input and second input
//		System.out.println("Enter First Number");
//		int a = sc.nextInt();
//		System.out.println("Enter Second Number");
//		int b = sc.nextInt();
//		
//		System.out.println("Addition of First and Second number is : "+(a+b));
//		System.out.println("Addition of First and Second number is : "+Integer.sum(a, b));
		
		
		int numberread=0;
		int sum=0;
		
		while(true)
		{
			if(numberread==5)
			{
				break;
			}
			System.out.println("Enter number");
			sum=sum+sc.nextInt();
			numberread++;
				
		}
		System.out.println("sum of number is "+sum);
		
	}

}
