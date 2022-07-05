package logicalProgaramsClass;

public class ReverseIntegerNumber {

	public static void main(String[] args) {
		
		int num=123456789;
		
		String strnum = Integer.toString(num);
		String rev = "";
		
		for(int i=strnum.length()-1; i>=0; i--)
		{
			rev=rev+strnum.charAt(i);
		}
		
		System.out.println("Original Number is : "+num);
		
		int revnum = Integer.parseInt(rev);
		
		System.out.println("Reversed Number is : "+revnum);
		
		//Without String
		System.out.println("Reverse Number without converting to String============");
		int rev2=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int remainder = i%10;
			
			rev2=(rev2*10)+remainder;
		}
		
		System.out.println("Reversed number without converting to string is : "+rev2);
		
		int temp1 = 0;
		while(num/10==0)
		{
			temp1 = num%10;
		}
		System.out.println(temp1);
	}

}
