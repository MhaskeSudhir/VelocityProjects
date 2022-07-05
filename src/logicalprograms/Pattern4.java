package logicalprograms;

public class Pattern4 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++)
		{
			for (int a=0; a<i; a++)
			{
				System.out.print(" ");
			}
			for (int j=i; j<=5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int s=5; s>=0; s--)
		{
			for (int a=s; a>0; a--)
			{
				System.out.print(" ");
			}
			for (int j=5; j>=s; j--)
			{
				System.out.print("* ");
			}
			
			
			System.out.println();
		}

	}

}
