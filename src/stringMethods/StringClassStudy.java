package stringMethods;

public class StringClassStudy {

	public static void main(String[] args) {
		// String has index which start from 0, 1, 2, and so on
		// METHODS IN STRING CLASS ARE NON-STATIC
		// ALL METHODS IN STRING CLASS ARE CASE SENSITIVE EXCEPT EQUAL IGNORE METHOD
		
		// SAME MEMORY AREA FOR VELOCITY AS SAME VALUE STORED IN OBJECT WITHOUT NEW KEYWORD-----NO DUPLICATE ALLOWED
		
		String name="velocity";  // OBJECT STORED IN CONSTANT POOL AREA AS NEW KEYWORD NOT USED
		
		// DEFFERENT MEMORY ARE FOR VELOCITY AS SAME VLAUE STORED IN OBJECT BUT USING NEW KEYWORD----DUPLICATE ALLOWED
		
		String name1= new String("velocity");    // OBJECT STORED IN NON-CONSTANT POOL AREA AS NEW KEYWORD USED		
		String name3= new String("velocity12345");  // OBJECT STORED IN NON-CONSTANT POOL AREA AS NEW KEYWORD USED
		
		// USE OF LENGTH METHOD OF STRING CLASS
		System.out.println("LENGTH METHOD IN STRING CLASS================================================");
		
		name.length(); // here name is object and length is method name --- calling length method
		
		System.out.println("Length of String value stored in name object is "+name.length());  // printing length of name variable i.e velocity
		
		int strlength=name1.length();   // TO USE LENGTH VALUE WE HAVE TO STORE IT IN REFERENCE VARIABLE
		
		int Stringplusone=strlength+1;  // ADDING 1 TO REFERENCE VARIABLE WHICH STORED STRING LENGTH OF NAME OBJECT
		
		System.out.println("String length plus one is "+Stringplusone);
		
		System.out.println("Length of name3 is "+name3.length());  // PRINTING VALUE IN OBJCET NAME3 i.e. velocity12345 = 13
		
		// USE OF TO UPPER CASE METHOD OF STRING CLASS
		System.out.println("UPPER CASE METHOD IN STRING CLASS==============================================");
		// USED TO CAPITALIZE EACH CHARACTER WHICH STORED IN OBJECT OR REFERENCE VARIABLE
		
		String word="telecommunication";
		
		System.out.println("CAPITALIZATION OF STRING S IS "+word.toUpperCase()); // For only printing
		
		String word1=word.toUpperCase();                      // stored in reference variable to use further
		System.out.println("Capital value of s is "+word1);
		
		// USE OF TO LOWER CASE METHOD OF STRING CLASS
		System.out.println("LOWER CASE METHOD IN STRING CLASS=======================================");
		// USED TO CONVERT IN LOWERCASE VALUE STORED IN OBJECT OR REFERENCE VARIABLE
		
		String capital="MANAGEMENT";
		
		System.out.println("Lower value of string s is "+capital.toLowerCase());
		
		// USE OF EQUAL EQUAL OPERATOR
		System.out.println("EQUAL EQUAL OPERATER IN JAVA=====================================");
		// '==' COMPARES ONLY MEMORY LOCATION--- NOT CASE SENSITIVE
		
		String character="memorysize";         //CONSTANT POOL AREA---SAME MEMORY FOR SAME VALUE
		String characterduplicate="memorysize"; //CONSTANT POOL AREA---SAME MEMORY FOR SAME VALUE
		String character1="MEMORYSIZE";     // CONSTANT POOL ARE
		
		String character2 = new String("memorysize");                  //NON-CONSTANT POOL AREA--DIFFERENT MEMORY ALWAYS 
		String characternoduplicate= new String("memorysize");         // NON-CONSTANT POOL AREA--DIFFERENT MEMORY ALWAYS
		
		// FOR CONSTANT POOL AREA OBJECT WITHOUT NEW KEYWORD
		System.out.println(character==characterduplicate); //AS VALUE ARE SAME OF BOTH OBJECT ALOCATED ONLY SINGLE MEMORY FOR BOTH = TRUE
		System.out.println(character==character1); // AS IT IS CASE SENSITIVE ALLOCATE DIFFERENT MEMORY TO LOWER AND UPPER CASE SAME STRING
		
		// FOR NON-CONSTANT POO ARE WITH NEW KEYWORD
		
		System.out.println(character2==characternoduplicate);  // IN NON-CONSTANT POOL ARE THERE IS ALWAYS DIFFERENT MEMORY ALLOCATED
		// NO SAME MEMORY FOR SAME VARIABLE VALUE-----DUPLICATE ALLOWED
		
		// STUDY OF EQUAL METHOD IN STRING CLASS
		// COMPARES CONTENT INSIDE REFERENCE VARIBLE/OBJECT
		System.out.println("EQUAL METHOD OF STRING CLASS ==================================================");
		String equal="ABCD";
		String equal1="ABCD";
		String equal2="abcd";
		String notequal="ABCDE";
		
		System.out.println(equal.equals(equal1)); // ABCD = ABCD -- True
		System.out.println(equal.equals(equal2)); // ABCD = abcd -- False
		System.out.println(equal.equals(notequal)); // ABCD = ABCDE-- False
		
		boolean result=equal.equals(equal1);    // FOR USE OF BOOLEAN RESULT OF EQUAL METHOD STORED IN REFERENCE VARIABLE
		System.out.println("RESULT OF COMPARSON OF STRING ABCD AND ABCD IS "+result);
		
		// equalIgnorecase METHOD OF STRING CLASS
		// CHECKS ONLY CONTENT IN OBJECT ARE SAME OR NOT ----- UPPER CASE AND LOWER CASE NOT CHECKED
		
		System.out.println("EQUAL IGNORE METHOD IN STRING CLASS====================================================");
		System.out.println(equal.equalsIgnoreCase(equal2)); // ABCD = abcd --- true only content checked 

	}

}
