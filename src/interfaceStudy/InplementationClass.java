package interfaceStudy;

public class InplementationClass implements MyInterface // CLASS IMPLEMENTS INTERFACE
{

	//IMPLEMENTATION CLASS TO COMPLETE---INCOMPLETE METHODS FROM INTERFACE
	
	public static void main(String[] args) {
		
		InplementationClass ic = new InplementationClass();  // OBJECT OF IMPLEMENTATION CLASS IS CREATED
		
		ic.test();    // CALLING METHOD FROM INTERFACE WHICH ARE COMPLETED IN IMPLEMENTATION CLASS
		ic.test1();   // CALLING METHOD FROM INTERFACE WHICH ARE COMPLETED IN IMPLEMENTATION CLASS
		ic.test2();   // CALLING METHOD FROM INTERFACE WHICH ARE COMPLETED IN IMPLEMENTATION CLASS
		
		ic.test3();   // THIS METHOD IS OWN METHOD OF IMPLEMENTATION CLASS
		
		System.out.println("Static and final Variable from MyInterface is a = "+a);  //CALLING VARIABLE FROM INTERFACE 
		                                                                          // AS VARIABLE IS STATIC WE CAN DIRECTLY CALL IT
		
		// a=a+10;------CAN NOT UPDATE VARIABLE FROM INTERFACE AS THEY ARE BY DEFAULT FINAL

	}

	@Override    // OVERRIDE MEANS INCOMPLETE METHOD ARE TAKEN FROM INTERFACE
	public void test() {
		
		System.out.println("It is incomplete method from interface completed in Inmplementation class");
		
	}

	@Override
	public void test1() {
		
		System.out.println("It is incomplete method from interface completed in Inmplementation class");
		
	}

	@Override
	public void test2() {
		System.out.println("It is incomplete method from interface completed in Inmplementation class");
		
	}
	
	public void test3()  // THIS METHOD DOES  NOT HAVE OVERRIDE WRITTEN ON IS SO IT IS SAME CLASS'S METHOD
	{
		System.out.println("It is complete method already from Implementation class");
	}

}
