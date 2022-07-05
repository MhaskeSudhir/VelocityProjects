package controlStatement;

public class SwitchAssignment2 {

	public static void main(String[] args) {
		
		String DAY="FRIDAY";
		
		switch (DAY) {
		case "MONDAY": System.out.println("THIS IS FIRST DAY OF WEEK");
			break;
			
		case "TUESDAY": System.out.println("THIS IS SECOND DAY OF WEEK");
		break;
		
		case "WEDNESDAY": System.out.println("THIS IS THIRD DAY OF WEEK");
		break;
		
		case "THURSDAY": System.out.println("THIS IS FORTH DAY OF WEEK");
		break;
		
		case "FRIDAY": System.out.println("THIS IS FIFTH DAY OF WEEK");
		break;
		
		case "SATURDAY": System.out.println("THIS IS SIXTH DAY OF WEEK");
		break;
		
		case "SUNDAY": System.out.println("THIS IS SEVENTH DAY OF WEEK");
		break;

		default:  System.out.println("WRONG NUMBER ENTERED");
			break;
		}

	}

}
