package this_and_super_keywords;

public class This_Keyword {
	
	int a=500;   // GLOBAL VARIABLE A---ACCESSIBLE TO ALL METHOD
	int b=100;   // GLOBAL VARIABLE B---ACCESSIBLE TO ALL METHOD
	
	public void test()
	{
		int a=200;      // LOCAL VALUE OF A FOR TEST METHOD ONLY
		
		int sum=a+100;  // ADDING 100 TO LOCAL VALUE OF A--HERE DEFAULT VALUE OF A IS OF LOCAL VARIABLE VALUE IN TEST METHOD USED 
		
		System.out.println("SUM LOCAL VARIABLE A WITH 100 IS = "+sum); // 
		
		int sum2=this.a+100;    // USING THIS KEYWORD CALLED GLOBAL VALUE OF A DECLARED OUTSIDE MAIN AND ANY METHOD
		
		System.out.println("SUM2 OF GLOBAL VARIABLE USING THIS KEYWORD AND 100 IS = "+sum2);
	}
	
	public void test1() 
	{
		int b=400;  // LOCAL VALUE OF B FOR TEST1 METHOD ONLY
		
		int sum=b+100;  // ADDING 100 INTO LOCAL VALUE OF B FROM TEST1 METHOD
		
		System.out.println("SUM IS "+sum);
		
		int sum1=this.b+b;   // ADDING GLOBAL VALUE OF B USING THIS KEYWORD AND LOCAL VALUE OF B FROM TEST1 METHOD 
		
		System.out.println("SUM IS "+sum1);
	}

	public static void main(String[] args) {
		
		This_Keyword tk = new This_Keyword();
		
		tk.test();
		tk.test1();
		
	}

}
