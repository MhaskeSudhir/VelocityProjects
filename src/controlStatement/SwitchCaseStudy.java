package controlStatement;

public class SwitchCaseStudy {

	public static void main(String[] args) {
		// SWITCH CASE DOES NOT CHECK STEP BY STEP CONDITION LIKE ELSE IF STATEMENT
		// SWITCH CASE DIRECTLY JUMP ON CONDITIONS
		
		// FOR ENGINEERING STUDENTS
		// 1---FIRST YEAR ENGINEERING
		// 2---SECOND YEAR ENGINEERING
		// 3---THIRD YEAR ENGINEERING
		// 4---FORTH YEAR ENGINEERING
		// IF OTHER NUMBER ENTERED---INVALID YEAR ENTERED
		
		int Year=3;
		
		switch (Year) {
		case 1: System.out.println("FIRST YEAR ENGINEERING");
		break;
		
		case 2: System.out.println("SECOND YEAR ENGINEERING");
		break;
		
		case 3: System.out.println("THIRD YEAR ENGINEERING");
		break;
		
		case 4: System.out.println("FORTH YEAR ENGINEERING");
		break;

		default: System.out.println("INVALID YEAR ENTERED");
			break;
		}
	}

}
