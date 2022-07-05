package access_specifier;

public class Protected_Access_Modifier {
	
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	
	private void display1()
	{
		System.out.println("HI I AM PRIVATE METHOD FROM PROTECTED ACCESS MODIFIER CLASS--ACCESS SPECIFIER PACKAGE");
	}
	
	void display2()
	{
		System.out.println("HI I AM DEFAULT METHOD FROM PROTECTED ACCESS MODIFIER CLASS--ACCESS SPECIFIER PACKAGE");
	}
	
	protected void display3()
	{
		System.out.println("HI I AM PROTECTED METHOD FROM PROTECTED ACCESS MODIFIER CLASS--ACCESS SPECIFIER PACKAGE");
	}
	
	public void display4()
	{
		System.out.println("HI I AM PUBLIC METHOD FROM PROTECTED ACCESS MODIFIER CLASS--ACCESS SPECIFIER PACKAGE");
	}

	public static void main(String[] args) 
	{
		// WE CAN CALL ALL MEMBER OF CLASS IN SAME CLASS
		
		Protected_Access_Modifier pam = new Protected_Access_Modifier();
		
		pam.display1();
		
		System.out.println(pam.a);

	}

}
