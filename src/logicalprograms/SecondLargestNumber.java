package logicalprograms;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int a[]= {1,2,5,3,6};
		
		int temp;
		for (int i=0; i<=a.length-1; i++)
		{
			for (int j=i+1; j<=a.length-1;j++)     // j=i+1
			{
			if(a[i]<=a[j])
			{
				System.out.println(a[i]+" "+a[j]);
				temp=a[i];   // temp=1 as a[i]=1
				a[i]=a[j];   // a[i]=2 as a[j]=2
				a[j]=temp;   // a[j]=1 as temp=1
				}
			}
			System.out.println("=================");
		}
		for(int b=0;b<=a.length-1;b++)
		{
			System.out.print(a[b]+" ");
		}
		System.out.println("second largest no is "+a[1]);
	}

}
