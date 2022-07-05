package access_specifier;

public class PrivateAccessSpecifier {

	public int a=10;  // GLOBAL -NONSTATIC- PUBLIC VARIABLE
	private int b=20;  // GLOBAL NONSTATIC- PRIVATE VARIABLE
	
	public static void main(String[] args) {
		
		PrivateAccessSpecifier pas = new PrivateAccessSpecifier();
		
		pas.test1();  // CALLING PRIVATE METHOD IN SAME CLASS----MARKED BY RED BOX
		
		pas.test();  // CALLING PUBLIC METHOD IN SAME CLASS --- MARKED BY GREEN DOT
		
		System.out.println("CALLING PUBLIC VAIRABLE OF SAME CLASS a = "+pas.a);  // CALLING PUBLIC GLOBAL VARIABLE IN SAME CLASS
		
		System.out.println("CALLING PRIVATE VARIABLE OF SAME CLASS b = "+pas.b);  // CALLING PRIVATE GLOBAL VARIABLE IN SAME CLASS

	}
	
	public void test()
	{
		System.out.println("THIS IS PUBLIC NON-STATIC TEST METHOD");
	}
	
	private void test1()
	{
		System.out.println("THIS IS PRIVATE NON-STATIC TEST METHOD");
	}

}
