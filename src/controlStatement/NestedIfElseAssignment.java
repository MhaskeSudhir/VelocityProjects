package controlStatement;

public class NestedIfElseAssignment {

	public static void main(String[] args) {
		int digit1=1;
		int digit2=2;
		int digit3=3;
		int digit4=4;
		int digit5=5;
		
		if (1==digit1)
		{
			System.out.println("FIRST DIGIT IS CORRECT");
			
			if (2==digit2)
			{
				System.out.println("SECOND DIGIT IS CORRECT");
				
				if (3==digit3)
				{
					System.out.println("THIRD DIGIT IS CORRECT");
					if (4==digit4)
					{
						System.out.println("FORTH DIGIT IS CORRECT");
						
						if (5==digit5)
						{
							System.out.println("FIFTH DIGIT IS CORRECT");
							System.out.println("=========================");
							System.out.println("ALL DIGITS ARE CORRECT");
						}
						else
						{
							System.out.println("FIFTH DIGIT IS INCORRECT");
						}
					}
					else
					{
						System.out.println("FORTH DIGIT IS INCORRECT");
					}
				}
				else
				{
					System.out.println("THIRD DIGIT IS INCORRECT");
				}
			}
			else
			{
				System.out.println("SECOND DIGIT IS INCORRECT");
			}
		}
		else
		{
			System.out.println("FRIST DIGIT IS INCORRECT");
		}

	}

}
