package access_specifier;

public class To_Test_Protected {

	public static void main(String[] args) {
		
		//PROTECTED ACCESS MODIFIER---MARKED YELLOW DIAMOND
		
		Protected_Access_Modifier pam1 = new Protected_Access_Modifier();
		
		pam1.display2();  //CALLING DEFAULT METHOD FROM ANOTHER CLASS---DEFAULT ACCESSIBLE WITHIN PACKAGE
		
		pam1.display3();  //CALLING PROTECTED METHOD FROM ANOTHER CLASS
							// PROTECTED ACCESSIBLE WITHIN PACKAGE AND IN ANOTHER PACKAGE USING INHERITANCE
		
		pam1.display4();  //CALLING PUBLIC METHOD FROM ANOTHER CLASS---PUBLIC ACCESSIBLE WITHIN PROJECT
		
		//pam1.display1();------display1=PRIVATE METHOD CAN'T CALL IN ANOTHER CLASS
		
		//System.out.println("PRIVATE VARIABLE A = "+pam1.a);---CAN'T CALL PRIVATE VARIABLE IN ANOTHER CLASS
		
		System.out.println("DEFAULT VARIABLE FROM ANOTHER CLASS B = "+pam1.b);
		
		System.out.println("PROTECTED VARIABLE FROM ANOTHER CLASS C = "+pam1.c);
		
		System.out.println("PUBLIC VARIABLE FROM ANOTHER CLASS D = "+pam1.d);

	}

}
