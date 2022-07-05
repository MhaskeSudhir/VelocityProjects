package inheritance;

public class Son extends Father   // extends used to inherited father class (super class) property in son (sub-class)
	
	// CANNOT WRIGHT public class son extends Father,Mother--MULTIPLE INHERITANCE IS NOT ALLOWED IN JAVA
	// DUE TO DIAMOND AMBIGUITY PROBLEM MULTIPLE INHERITANCE IS NOT POSSIBLE
{
	
	public void bike()  // METHOD OF SON'S CLASS 
	{
		System.out.println("SON'S BIKE");
	}

	// AS FATHER CLASS IS INHERITED--- SON CLASS CONTAIN 3 METHOD 
	// 1. BIKE()-- OWN METHOD OF SON CLASS
	// 2. LOVE()-- METHOD INHERITED FROM FATHER CLASS
	// 3. HOME()--METHOD INHERITED FROM FATHER CLASS
}
