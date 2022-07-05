package logicalprograms;

public class LargestArray {

	public static void main(String[] args) {
		
		int a[]= {50,65,44,87,36,98,30};
		//FOR MAXIMUM NUMBER FROM ARRAY
		int max=a[0];
		
		for (int i=1 ; i<=a.length-1 ; i++)
		{
			if (a[i]>max)
			{
				max=a[i];
				System.out.println(max);
			}
		}
		
		System.out.println("MAXIMUM ELEMENT IN ARRAY IS "+max);
	
		// FOR MINIMUM NUMBER FROM ARRAY 
		int min=a[0];
		
		for (int j=1;j<a.length;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
				System.out.println(min);
			}
		}
		System.out.println("MINIMUM ELEMENT IN ARRAY IS "+min);
	}
}
