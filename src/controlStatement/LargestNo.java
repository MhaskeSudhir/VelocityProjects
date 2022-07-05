package controlStatement;

public class LargestNo {

	public static void main(String[] args) {
		int a=100, b=40, c=30;
		int largestNo;
		
		if (a>=b)
		{
			if (a>=c)
			{
				largestNo=a;
			}
			else
			{
				largestNo=c;
			}
		}
		else
		{
			if (b>=c)
			{
				largestNo=b;
			}
			else
			{
				largestNo=c;
			}
		}
		System.out.println("LARGEST NUMBER IS "+largestNo);
	}

}
