package stringMethods;

public class StringClassStudy1 {

	public static void main(String[] args) {
		// STUDY OF CONTAINS METHOD OF STRING CLASS
		// IT CHECKS WHETHER CHARACTER PRESENT IN STRING OR NOT
		System.out.println("Study of contains methods of string class============================================");
		
		String a="MhArAsHtRA";
		System.out.println(a.contains("tRA"));
		System.out.println(a.contains("tra"));
		
		boolean result=a.contains("tRA");
		System.out.println("is tRA present in MhArAsHtRA ="+result);
		
		System.out.println("IS EMPTY METHOD USE OF STRING CLASS========================");
		// RETURN TRUE IF LENGTH OF STRING IS ZERO
		
		String b="";   // EMPTY STRING VALUE OF B
		String d="     ";
		System.out.println(d.isEmpty()); // FALSE----as contains whitespaces
		System.out.println(b.isEmpty()); // TRUE-----does not contain anything
		
		//String c=null;
		//System.out.println(c.isEmpty());   //NullPointerException---Run time Error---can not perform operation on null
		
		System.out.println(b.length());   // length of b is zero as contain no character or whitespace
		System.out.println(d.length());   // d variable only contain 5 whitespaces counted as length
		
		System.out.println("IS BLANK METHOD USE OF STRING CLASS========================");
		// TRUE ONLY IF CHARATER PRESENT/FALSE IF ONLY WHITESPACES OR NO CHARACTER PRESENT
		String f="blank";
		
		System.out.println(b.isBlank());   // b variable has zero length does not contain anything hence blank = true
		System.out.println(d.isBlank());   // d variable contains 5 whitespaces considered as blank because no charater is present
		System.out.println(f.isBlank());   // f variable contains "blank" word in it hence false
		
		// STUDY CHAR AT METHOD OF STRING CLASS
		// TO CHECK CHARACTER PRESENT AT INDEX NUMBER
		// EXAMPLE: P-0, U-1, N-2, E-3---PUNE
		System.out.println("CHAR AT METHOD STUDY OF STRING CLASS===========================================");
		
		String city="PUNE";
		
		char answer=city.charAt(1);  // STORED IN REFERENCE VARIABLE FOR FUTURE USE
		System.out.println("character present at index number 1 in pune is "+answer);
		
		System.out.println("CHARACTER PRESENT AT INDEX NUMBER 2 IN PUNE IS "+city.charAt(2));
		
		//System.out.println("CHARACTER AT INDEX NUMBER 4 IS "+city.charAt(4));
		//String Index Out Of Bounds Exception: String index out of range: 4 ----range is only from 0 to 3 for pune
		// code gets stuck at exception error and cannot execute further hence comment it
		
		// STUDY OF ENDS WITH METHOD OF STRING CLASS
		System.out.println("ENDS WITH METHOD OF STRING CLASS==============================================");
		// TO CHECK STRING ENDS WITH WHICH CHARACTERS
		// IT CHECKS COUNTINOUS SEQUENCE ONLY
		
		String t="America";
		System.out.println(t.endsWith("rica"));  // TRUE ----- AMERICA ENDS WITH RICA
		
		// STUDY OF STARTS WITH METHOD OF STRING CLASS
		System.out.println("STARTS WITH METHOD STUDY OF STRING CLASS========================================");
		
		System.out.println("America starts with Ame = "+t.startsWith("Ame"));

	}

}
