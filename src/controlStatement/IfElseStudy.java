package controlStatement;

public class IfElseStudy {

	public static void main(String[] args) {
		// IF ELSE USED FOR CHEKING TWO CONDITION
		// IF MARKS ARE GREATER THAN OR EQUAL TO 40 THEN PRINT PASS 
		// ELSE PRINT FAIL
		
		int marks=35;
		
		if(marks>=40)
		{
			System.out.println("YOU ARE PASS");
		}
		
		//if(marks>100)    // THIRD CONDITION IS NOT ALLOWED IN IF ELSE CONTROL STATEMENT
		//{
		//	System.out.println("WRONG MARKS ENTERED");
	//	}
		
		else
		{
			System.out.println("YOU ARE FAIL");
		}

	}

}
