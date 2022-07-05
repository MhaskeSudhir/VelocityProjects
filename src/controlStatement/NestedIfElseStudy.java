package controlStatement;

public class NestedIfElseStudy {

	public static void main(String[] args) {
		// IF ELSE STATEMENT NESTED INSIDE IF STATEMENT
		//IF USERNAME IS CORRECT--->ENTER PASSWORD--->IF USERNAME IS NOT CORRECT----> PLEASE CHECK USERNAME
		//IF PASSWORD IS CORRECT--->lOGIN SUCCESSFULY---->IF PASSWORD IS INCORRECT----> INVALID PASSWORD
		
		String UN="VELOCITY";             //USERNAME
		String PWD="velocity@123";        //PASSWORD
		
		if ("VELOCITY"==UN)        // OUTER LOOP IF FOR USERNAME
		{
			System.out.println("USERNAME IS CORRECT ; PLEASE ENTER PASSWORD");
			
			if("velocity@123"==PWD)     // INNER LOOP IF FOR PASSWORD
			{
				System.out.println("PASSWORD IS CORRECT ; LOGIN SUCCESSFUL");
			}
			
			else                        // INNER LOOP ELSE IF WRONG PASSWORD ENTERED
			{
				System.out.println("INVALID PASSWORD ENTERED");
			}
		}
		
		else                       // OUTER LOOP ELSE IF WRONG USERNAME ENTERED
		{
			System.out.println("USERNAME IS INCORRECT");
		}

	}

}
