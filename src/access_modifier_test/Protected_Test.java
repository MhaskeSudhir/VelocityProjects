package access_modifier_test;

import access_specifier.Protected_Access_Modifier;

public class Protected_Test extends Protected_Access_Modifier
{

	public static void main(String[] args) {
		
		Protected_Access_Modifier pam3 = new Protected_Access_Modifier();
		
		pam3.display4(); // CAN CALL ONLY PUBLIC METHOD OUTSIDE PACKAGE
		
		// TO MAKE USE OF PROTECTED METHOD OUTSIDE PACKAGE, CREATED OBJECT OF SUB-CLASS AS WE USE IN INHERITANCE
		
		Protected_Test pt = new Protected_Test();
		
		pt.display3();   // PROTECTED METHOD CALLING USING INHERITANCE 
		                 // AS PROTECTED TEST IS CHILD CLASS AND EXTENDS PROTECTED ACCESS MODIFIER
		
		pt.display4();  // CALLING PUBLIC METHOD ---SCOPE WITHIN PROJECT
		
		// pt.display1();---PRIVATE METHOD CAN'T CALL OUTSIDE PACKAGE OR CLASS
		// pt.display2();----DEFAULT METHOD CAN'T CALL OUTSIDE PACKAGE
		
		System.out.println(pt.c+" = C PROTECTED VARIABLE FROM PROTECTED ACCESS MODIFIER CLASS PCKG ACCESS SPECIFIER");
		//PROTECTED VARIABLE ACCESSIBLE OUTSIDE PACKAGE USING INHERITANCE
		
		System.out.println(pt.d+" = D PUBLIC VARIABLE FROM PROTECTED ACCESS MODIFIER CLASS PCKG ACCESS SPECIFIER"); 
		// PUBLIC VARIABLE ACCESSIBLE INSIDE PROJECT
		
		// System.out.println(pt.a);-----CANT CALL PRIVATE VARIABLE OUTSIDE PACKAGE OR ANOTHER CLASS
		// System.out.println(pt.b);-----CANT CALL DEFAULT VARIABLE OUTSIDE PACKAGE
		

	}

}
