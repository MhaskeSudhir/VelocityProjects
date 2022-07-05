package controlStatement;

public class NestedIfElseAssignment2 {

	public static void main(String[] args) {
		double n1=1.5, n2=2.5, n3=3.5;
		double largest;
		
		if (n1>=n2)
		{
		
			if (n1>=n3)
			{
				largest=n1;
			}
			
			else
			{
			largest=n3;
			}
		}
		else
		{
			if (n2>=n3)
			{
				largest=n2;
			}
			else
			{
				largest=n3;
			}
		}
		
		System.out.println("largest no is "+largest);

	}

}
