package logicalProgaramsClass;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int num=3;
		int fact=1;
		
		//factorial of 5! == 5*4*3*2*1 ==120
		
		for( int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Number is : "+num);
		System.out.println("Factorial of Number is : "+fact);


	}

}
