package access_specifier;

public class To_Test_Default {

	public static void main(String[] args) {
		
	  Default_Access_Modifier dam1= new Default_Access_Modifier();
	  
	  dam1.test1(); // CALLING PUBLIC METHOD FROM ANOTHER CLASS--ACCESSIBLE WITHIN PROJECT
	  dam1.test2(); // CALLING DEFAULT METHOD FROM ANOTHER CLASS--ACCESSIBLE WITHIN PACKAGE
	  
	  // dam1.test3(); // CAN'T CALL PRIVATE METHOD IN ANOTHER CLASS--ACCESSIBLE WITHIN THAT CLASS ONLY
	  
	  System.out.println("CALLING DIFAULT VARIABLE FROM DEFAULT ACCESS MODIFIER CLASS A = "+dam1.a);
	  
	  System.out.println("CALLING PUBLIC VARIABLE FROM DEFAULT ACCESS MODIFIER CLASS B = "+dam1.b);
	  
	  //System.out.println(dam1.c);   --CAN'T CALL PRIVATE VARIABLE IN ANOTHER CLASS--NOT VISIBLE TO ANOTHER CLASS
	}

}
