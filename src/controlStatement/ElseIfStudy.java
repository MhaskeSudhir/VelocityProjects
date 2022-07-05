package controlStatement;

public class ElseIfStudy {

	public static void main(String[] args) {
		// IN ELSE IF===MULTIPLE CONDITIONS ARE CHECKED
		// IF  STATEMENT WITH ITS OWN CONDITION
		// ELSE IF STATEMENT WITH ITS CONDITION
		// OPTIONAL ELSE STATEMENT WITH NO CONDITION
		
		// IF MARKS ARE >= 75 ; DISTINCTION
		// IF MARKS ARE >= 66 ; FIRST CLASS
		// IF MARKS ARE >= 40 ; PASS
		// IF MARKS ARE < 40  ; FAIL
		
		int marks=-10;
		
		if (marks>100)
		{
			System.out.println("WRONG DATA ENTERED");
		}
		
		else if (marks>=75)
		{
			System.out.println("YOU ARE IN DISTINCTION");
		}
		
		else if (marks>=65)
		{
			System.out.println("YOU ARE IN FIRST CLASS");
		}
		
		else if  (marks>=40)
		{
			System.out.println("YOU ARE PASS");
		}
		
		else if (marks<0)
		{
			System.out.println("WRONG MARKS ENTERED");
		}
		
	     else if (marks<40)
		{
			System.out.println("YOU ARE FAIL");
		}

	}

}
