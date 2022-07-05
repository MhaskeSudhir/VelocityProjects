package controlStatement;

public class SwitchAssignment3 {

	public static void main(String[] args) {
		
		char grade='A';
		
		switch (grade) {
		case 'A': System.out.println("YOUR MARKS IS 75+");
		break;
		
		case 'B': System.out.println("YOUR MARKS IS BETWEEN 60 TO 75");
		break;
		
		case 'c': System.out.println("YOUR MARKS IS BETWEEN 40 TO 60");
		break;
		
		case 'D': System.out.println("YOUR ARE FAILED");
		break;

		default: System.out.println("INVALID GRADE ENTERED");
			break;
		}

	}

}
