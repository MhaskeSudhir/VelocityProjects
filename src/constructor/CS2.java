package constructor;

public class CS2 {
	
	// WITH PARAMETER CONSTRUCTOR
	// int a = IS NONSTATIC VARIABLE ; static int a = IS STATIC VARIABLE
	
	int a;       // GLOBAL VARIABLE FOR ALL METHOD===DIFINED INSIDE CLASS ONLY NOT IN ANY METHOD OR IN MAIN
	int b;       // GLOBAL VARIABLE FOR ALL METHOD===DIFINED INSIDE CLASS ONLY NOT IN ANY METHOD OR IN MAIN
	int c;       // GLOBAL VARIABLE FOR ALL METHOD===DIFINED INSIDE CLASS ONLY NOT IN ANY METHOD OR IN MAIN
	
	public CS2()    // WITHOUT PARAMETER CONSTRUCTOR
	{
		a=10;  // LOCAL VARIABLE DIFINED ONLY FOR THIS METHOD  
		b=10;  // LOCAL VARIABLE DIFINED ONLY FOR THIS METHOD 
		c=10;  // LOCAL VARIABLE DIFINED ONLY FOR THIS METHOD 
	}

	public CS2(int x)  //WITH ONE PARAMETER CONSTRUCTOR
	{
		a=x;  //HERE b AND c ARE ZERO----VALUE OF A IS X
	}
	
	public CS2(int x, int y) // WITH TWO PARAMETER CONSTRUCTOR
	{
		a=x;   // HERE C IS ZERO
		b=y;
	}
	
	public CS2(int x, int y, int z)  // WITH THREE PARAMETER VARIABLE
	{
		a=x;   //ALL X,Y,Z ARE ASSIGNED TO A,B,C
		b=y;
		c=z;
	}
	
	public void sum()  // SUM METHOD FOR ADDITION OF GLOBAL VARIABLE
	{
		int sum=a+b+c;
		System.out.println("sum of a+b+C is "+sum);
	}
	
	public static void main(String[] args)  // MAIN METHOD IS ALWAYS STATIC 
	{
		CS2 c1 = new CS2();  //with creation of this object automatic call to without parameter constructor
		c1.sum();            //VALUES GIVEN IN CONSTRUCTOR IS A=10, B=10, C=10  ; 10+10+10=30
		
		CS2 c2 = new CS2(10); //WITH CREATION OF THIS OBJECT AUTOMATIC CALLING TO SINGLE PARAMETER CONSTRUCTOR
		c2.sum();              // VALUE GIVEN ARE X=A=10---B AND C ARE ZERO OR NOT DEFINED  ; 10+0+0=10
		
		CS2 c3 = new CS2(10,10);   //WITH CREATION OF THIS OBJECT AUTOMATIC CALLING TO TWO PARAMETER CONSTRUCTOR
		c3.sum();                //VALUE GIVEN ARE X=A=10, Y=B=10  C=ZERO OR NOT DEFINED ; 10+10+0=20
		
		CS2 c4 = new CS2(10,10,10); //WITH CREATION OF THIS OBJECT AUTOMATIC CALLING TO THREE PARAMETER CONSTRUCTOR
		c4.sum();                  // VALUE GIVEN ARE X=A=10, Y=B=10, Z=C=10  ; 10+10+10=30
	}
	//SINGLE METHOD SUM() USED IN MANY WAYS USING DIFFERENT CONSTRUCTOR i.e SIGLE VARIABLE SUM. TWO VARIABLE SUM ETC.
}