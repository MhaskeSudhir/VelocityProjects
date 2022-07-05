package polymorphism;

public class Method_Overloading {

	public static void main(String[] args) {
		
		// METHOD OVERLOADING CREATED METHOD WITH SAME NAME BUT WITH DIFFERENT PARAMETER IN SAME CLASS
		
		Method_Overloading mo = new Method_Overloading();
		
		// BINDING OF METHOD DECLARTION AND DEFINITION TAKES PLACE AT THE TIME OF COMPILATION
		// BASED ON DIFFERENT PARAMETER DECLARED AS METHOD NAME IS SAME BUT PARAMETER ARE DIFFERENT
		
		mo.add();  // METHOD WITH NO PARAMETER ADD()
		
		mo.add(20, 30);  // METHOD WITH TWO INT PARAMETER ADD()
		
		mo.add(11.22f, 22.11f);  // METHOD WITH TWO FLOAT PARAMETER ADD()

	}
	
	public void add()  // METHOD WITH ZERO PARAMETER
	{
		int a=10;
		int b=20;
		
		int sum=a+b;
		
		System.out.println("sum of local variable a and b is "+sum);
	}
	
	public void add(int a,int b) // METHOD WITH TWO PARAMETER
	{
		int sum=a+b;
		
		System.out.println("Sum of parameter a and b is "+sum);
	}
	
	public void add(float a,float b) // METHOD WITH TWO PARAMETER WITH DIFFERENT DATATYPES
	{
		double sum=a+b;
		
		System.out.println("sum of parameter float a and b is "+sum);
	}

}
