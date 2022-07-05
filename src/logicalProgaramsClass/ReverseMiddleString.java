package logicalProgaramsClass;

public class ReverseMiddleString {

	public static void main(String[] args) {
		//To Reverse ODD index number String / To reverse middle strings
		
		String str="ABC DEF GHI JKL MNO";
		
		String[] arr = str.split(" ");
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(i%2==0)
			{
				System.out.print(arr[i]+" ");
			}
			else
			{
				String s=arr[i];
				arr[i]=reverseString(s);
				System.out.print(arr[i]+" ");
			}
		}

	}
	
	public static String reverseString(String in)
	{
		String rev="";
		
		for(int i=in.length()-1; i>=0; i--)
		{
			rev=rev+in.charAt(i);
		}
		
		return rev;
	}

}
