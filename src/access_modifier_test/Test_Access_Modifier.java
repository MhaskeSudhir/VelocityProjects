package access_modifier_test;

import access_specifier.Default_Access_Modifier;

public class Test_Access_Modifier {

	public static void main(String[] args) {

		Default_Access_Modifier dam = new Default_Access_Modifier();
		
		dam.test1();  // CALLING PUBLIC METHOD IN DIFFERENT PACKAGE IN SAME PROJECT
		
		//dam.test2();  // CAN'T CALL DEFAULT METHOD IN ANOTHER PACKAGE---IN SAME PACKAGE ONLY
		//dam.test3();  // CAN'T CALL PRIVATE METHOD IN ANOTHER PACKAGE---IN SAME CLASS ONLY
		
		System.out.println("CALLING PUBLIC VARIABLE ACCESS WITHIN PROJECT B= "+dam.b);   // CALLING PUBLIC VARIABLE
		
		//System.out.println("CALLING PRIVATE VARIABLE ACCESS WITHIN CLASS C = "+dam.c);   // CAN'T CALL PRIVATE VARIABLE
	
		//System.out.println("CALLING DEFAULT VARIABLE ACCESS WITHIN PACKAGE A = "+dam.a); // CAN'T CALL DEFAULT VARIABLE

		
	}

}
