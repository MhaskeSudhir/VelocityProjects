package logicalProgaramsClass;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String Original=sc.next();
		String Reversed="";
		System.out.println("Original String is : "+Original);
		
		for(int i=Original.length()-1; i>=0; i--)
		{
			Reversed=Reversed+Original.charAt(i);
		}
		
		System.out.println("Reversed String is : "+Reversed);
		System.out.println("===================================");
		if(Original.equalsIgnoreCase(Reversed))
		{
			System.out.println("String "+Original+" is Palindrome String");
		}
		else
		{
			System.out.println("String "+Original+" is Not Palindrome String ");
		}

	
	}

}
