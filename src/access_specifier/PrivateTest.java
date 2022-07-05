package access_specifier;

public class PrivateTest {

	public static void main(String[] args) {
		
		PrivateAccessSpecifier pas1 = new PrivateAccessSpecifier();
		
		pas1.test();  // ONLY PUBLIC METHOD IS VISIBLE FROM PRIVATEACCESSSPECIFIER CLASS
		
	//	pas1.test1(); ---- CAN'T CALL PRIVATE MEMBER FROM ANOTHER CLASS AS IT IS NOT VISIBLE
		
		//method test1() from the type PrivateAccessSpecifier is not visible in another class
		
		
		System.out.println("GLOBAL PUBLIC VARIABLE CALLING IN ANOTHER CLASS a = "+pas1.a);
		
	//	System.out.println(pas1.b);----b GLOBAL VARIABLE IS PRIVATE CANT CALL IN ANOTHER CLASS

	}

}
