package method;

public class MethodStudy {

	public static void main(String[] args)   // main method
	{

		add1();      // calling static method from same class; call using method name add1()
		
		Test1.mul();  //calling static method from another class; call using classname.methodname();
	}

	public static void add1()  // regular static method; complete method with method name and method body
	{
		int a;
		int b;
		
		a=20;
		b=10;
		
		int sum;
		
		sum=a+b;
		
		System.out.println("sum of a and b is "+sum);
	}
}
