package logicalProgaramsClass;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int orgnum= 153;
		int num=0;
		
		//ArmStrong number using For loop
//		for(int i=orgnum; i>0; i=i/10)   //153/10=15--15/10=--1/10=1
//		{
//			//System.out.println(i);
//			
//			int num1=i%10;      //153%10=3----15%10=5---1%10=1
//			//System.out.println(num1);
//		
//			num=num+(num1*num1*num1);
//		}
//		
//		System.out.println("Original number is : "+orgnum);
//		System.out.println("Addition of cube of each digit from orginal number is : "+num);
//		System.out.println("==============================================================");
//		if(orgnum==num)
//		{
//			System.out.println("Number "+orgnum+" is Armstrong Number!");
//		}
//		else
//		{
//			System.out.println("Number "+orgnum+" is NOT Armstrong Number!");
//		}
		
		//  Armstrong Number using While loop
		int temp=orgnum;
		int Arm=0;
		while(temp!=0)
		{
			num=temp%10;
			
			//System.out.println(num);
			Arm=Arm+(num*num*num);
			
			temp=temp/10;
		}
		
		System.out.println(Arm);
		
		if(orgnum==Arm)
			{
				System.out.println("Number is Armstrong Number!");
			}
			else
			{
				System.out.println("Number is NOT Armstrong Number!");
			}

	}
	

}
