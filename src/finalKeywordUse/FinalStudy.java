package finalKeywordUse;

public class FinalStudy {

	public static void main(String[] args) {
		
		int a=50; // It is Default variable as we are not written any keyword in front of it
		
		System.out.println("INITIAL VALUE OF DEFAULT VARIABLE A IS "+a);
		
		a=a+50;  // UPDATION OF VARIABLE A IS ALLOWED AS IT IS NOT DECLARED FINAL
		
		System.out.println("UPDATED VALUE OF A IS "+a);
		
		// FOR FINAL KEYWORD
		
		final int b=200; // IT IS FINAL VARIABLE AS WE ARE WRITTEN FINAL KEYWORD IN FRONT OF IT
		
		// b=b+100;----AS VARAIABLE B IS DECLARED FINAL WE CAN NOT UPDATE VALUE OF VARIABLE B
		
		System.out.println("INITIAL AND FINAL VALUE OF VARIABLE B IS "+b);
	}
	
	public void test()
	{
		System.out.println("I AM TEST METHOD FROM FINAL STUDY CLASS");
	}
	
	final public void test1()
	{
		System.out.println("I AM DECLARED FINAL TEST1 METHOD FROM STUDY CLASS");
	}

}
