package this_and_super_keywords;

public class B_ForSuperKeyword extends A_ForSuperKeyword
{

	int a=800;  // GLOLBAL VARIABLE SAME NAME AS IN SUPER CLASS A

	public void sample()
	{
		int a=10;  // LOCAL VARIABLE SAME NAME AS IN SUPER CLASS A AND SUB CLASS B
		
		int sum1=a+10;  // CALLING LOCAL VALUE OF A
		
		int sum2=this.a+10;  // CALLING GLOBAL VALUE OF A IN SAME CLASS
		
		int sum3=super.a+10; // CALLING GLOBAL VALUE OF A FROM SUPER CLASS
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
	public static void main(String[] args) 
	{
		B_ForSuperKeyword b = new B_ForSuperKeyword();   // CREATED OBJECT OF SUB-CLASS B
		
		b.sample();
	}

}
