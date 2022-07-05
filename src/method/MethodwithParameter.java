package method;

public class MethodwithParameter {

	public static void main(String[] args) 
	{
	// calling Method without Parameter
		MethodwithParameter mp = new MethodwithParameter();
		mp.addition();
		
    // Calling Method with Parameter
		
		mp.addition1(40, 40);
		

	}

	public void addition() //Method without Parameter
	{
		int a=10,b=20;
		int sum=a+b;
		System.out.println("Addition is for without parameter "+sum);
	}
	
	public void addition1(int a, int b)   //Method with Parameter
	{
		int sum=a+b;
		System.out.println("=====================================");
		System.out.println("Addition is for with Parameter "+sum);
	}
}
