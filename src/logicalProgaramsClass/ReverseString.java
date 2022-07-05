package logicalProgaramsClass;

public class ReverseString {

	public static void main(String[] args) {
		
//		String a="Aurangabad";
//		String rev="";
//		
//		System.out.println("Original Stirng is : "+a);
//		for(int i=a.length()-1;i>=0;i--)
//		{
//			rev=rev+a.charAt(i);
//			//i=9---rev=""+d
//			//i=8---rev=d+a
//			//i=7---rev=da+b
//		}
//		System.out.println("Reverse String is : "+rev);

		StringBuilder sb=new StringBuilder("Aurangabad");
		
		sb.reverse();
		String reverseString = sb.toString();
		System.out.println("Reverse String Using StringBuilder is : "+reverseString);
		
		
	}

}
