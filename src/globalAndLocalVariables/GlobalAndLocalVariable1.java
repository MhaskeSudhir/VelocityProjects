package globalAndLocalVariables;

public class GlobalAndLocalVariable1 {
	
	        int p=20;    //Global Non-Static Variable
	        int q=30;    //Global Non-Static Variable
	 static int r=40;     //Global Static Varable; STATIC VARIABLE IS ALWAYS GLOBAL
	 
	 public void test1()    // NON-STATIC METHOD
	 {
		 //IN NON-STATIC METHOD BOTH STATIC AND NONSTATIC VARIABLE CAN BE USE
		 int mul=p*q;
		 System.out.println("multiplication of nonstatic variable p and q in nonstatic mehod is "+mul);
	 }
	 
	 public static void test2()   // STATIC METHOD
	 {
		 // IN NON STAITC METHOD ONLY STATIC VARIABLE ARE ALLOWED
		 int sum=100+r;
		 System.out.println("Sum of static variable r and 100 in static method is "+sum);
	 }

	public static void main(String[] args) 
	{
		GlobalAndLocalVariable1 glv= new GlobalAndLocalVariable1();  //OBJECT CREATED TO CALL NONSTATIC METHOD
		
		glv.test1();   //NON-STATIC METHOD CALLED USING OBJECT
		
		test2();   // STATIC METHOD CAN BE CALLED DIRECTLY
		
		System.out.println("Value of nonstatic variable p is "+glv.p); // TO PRINT NONSTATIC VARIABLE 
		
		//glv.p;    WE CANNOT CALL STATIC OR NONSTATIC VARIABLE DIRECTLY WE HAVE TO USE IT
		
		int addition=100+glv.p;  // CALLING NONSTATIC VARIABLE USING ADDITION OPERATION
		
		System.out.println("Addition of nonstatic variable p and 100 is "+addition);
		
		System.out.println("Value of Static variable r is "+r);  //CALLING STAITC VARIABLE USING PRINT STATEMENT
		
		System.out.println("========================================================================================");
		
	   //  FOR SAMPLE CLASS (ANOTHER CLASS) CREATED IN SAME PACKAGE
		
		Sample s= new Sample(); //CREATED OBJECT OF ANOTHER CLASS (SAMPLE CLASS)
		
		s.display1();  // CALLING NONSTATIC METHOD FROM ANOTHER CLASS (sAMPLE CLASS)
		
		Sample.display2();   //CALLING STATIC METHOD FROM ANOTHER CLASS--------ANOTHER CLASS NAME.METHODNAME();
		
		// s.m ; We can not call nonstatic and static variable directly
		
		System.out.println("Value of nonstatic variable m from sample class is "+s.m);  //CALLING NONSTATIC GLOBLE VARIABLE FROM SAMPLE CLASS (ANOTHER CLASS)
		
		System.out.println("Value of Static variable n from sample class is "+Sample.n);  //CALLING STATIC GLOBLE VARIABLE FROM SAMPLE CLASS(ANOTHER CLASS)
		
		// OPERATION ON STATIC AND NON-STATIC VARIABLE FROM ANOTHER CLASS
		
		int sub=150-s.m;  // USING NONSTATIC VARIABLE FROM ANOTHER CLASS (SAMPLE CLASS)
		
		System.out.println("Substraction of nonstatic variable m and 100 is  "+sub);
		
		int mul=100*Sample.n;  // USING STATIC GLOBAL VARIABLE FROM ANOTHER CLASS (SAMPLE CLASS)
		
		System.out.println("Multiplication of Static variable n and 100 is "+mul);
		
		int Sub1=Sample.n-s.m;   // USING STATIC AND NONSTATIC VARIABLE FROM ANOTHER CLASS IN SAME OPERATION SUB1
		
		System.out.println("Substraction of Static and nonstatic variable n and m is "+Sub1);
		
		// VARIABLE CANNOT CALLED DIRECTLY WE HAVE TO USE IT FIRST LIKE PRINT STATEMENT, MATH OPERATION ETC.
		

	}

}
