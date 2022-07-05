package constructor;

public class CS1 {
	
	int a;          //variable declaration
	int b;         //Variable declaration

	public static void main(String[] args) 
	{
		//IF METHOD NAME AND CLASS NAME ARE SAME THEN IT IS A CONSTRUCTOR
		
		CS1 c1 = new CS1();    // Created object of class for constructor CS1----NO CALLING USING OBJECT NEED FOR CONSTRUCTOR AUTOMATIC CALLING
		c1.sum();        //CALLING NONSTATIC METHOD SUM, NOT CALLING CONSTRUCTOR

	}
	
    //   CS1()     // Default Constructor By Compiler----Formed at a time of Object Creation----It is hidden when not defined by user;compiler uses it
	//    {        //IF CONSTRUCTOR NOT DECLARE IN CLASS, THEN COMPILER PROVIDE DEFAULT CONSTRUCTOR WHICH IS HIDDEN
	//	
    //        }

	CS1()   // CONSTRUCTOR NAME SHOULD BE SAME AS CLASS NAME-----USER DEFINED CONSTRUCTOR WITHOUT PARAMETER
	        // NO RUTURN TYPE FOR CONSTRUCOR i.e VOID, STREAM ETC.---ONLY NAME OF CONSTRUCTOR IS USED
	{
		a=10;        //variable initialization in constructor
		b=20;       //variable initialization in constructor 
		
		System.out.println("Welcome to Constructor");
	}
	
	public void sum()    // NON STATIC METHOD------CONSTRUCTOR IS USED FOR NON-STATIC METHOD ONLY
	{
		int sum =a+b;
		System.out.println("Addition is "+sum);
	}
}
