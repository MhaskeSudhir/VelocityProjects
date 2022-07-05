package finalKeywordUse;

final public class A extends FinalStudy
{

	public static void main(String[] args) {
		
		A a = new A();
		
		FinalStudy fs = new FinalStudy();
		
		fs.test(); // calling public method from super class using superclass object
		a.test();  // calling public method from sub class using subclass object
		
		fs.test1(); // can call final method but cant override it
		a.test1();
		

	}

	public void test()
	{
		System.out.println("I AM TEST METHOD FROM CLASS A");
	}
	
	//public void test1()-----Cannot override the final method from FinalStudy
	//{
	//}
	
	// FINAL KEYWORD CAN BE USED IN FRONT OF VARIABLE, METHOD AND CLASS
	
	//IF CLASS WRITTEN AS FINAL THEN THIS CLASS CANT BE SUPER CLASS AS IT NOT DELIVER PROPERTY TO SUB-CLASS
	// CLASS WRITTEN AS FINAL CAN BE SUB-CLASS WHICH TAKES PROPERTY FROM SUPER CLASS
	
}
