package abstract_class;

public abstract class Test {

	public abstract void test_incomplete();  // WE CANNOT CALL INCOMPLETE METHOD AS IS HAS NO BODY
	
	public void test1_complete()
	{
		System.out.println("HI IT IS COMPLETE METHOD FROM ABSTRACT CLASS");
	}
	public static void main(String[] args) {
		
		// WE CANNOT CREATE OBJECT OF CLASS WHICH CONTAIN INCOMPLETE METHOD
		// ABSTRACT CLASS IS INCOMPLETE CLASS
		// CLASS CONTAIN INCOMPLETE METHOD IS INCOMPLETE CLASS
		
		// Test t = new Test();  // WE CANNOT CREATE OBJECT OF ABSTRACT CLASS
		
		//t.test_incomplete(); // OBJECT IS NOT VALID SO NO CALLING
		//t.test1_complete();  // OBJECT IS NOT VALID SO NO CALLING

	}
	
	public abstract void test2();

	public void test()
	{
		int a=10;
		System.out.println("value of a is "+a);
	}
	

}
