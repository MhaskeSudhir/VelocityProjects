package this_and_super_keywords;

public class A_ForSuperKeyword {

	int a=490;  //GLOBAL  VALUE OF A
	
	public void test()
	{
		int a=90;
		
		int sub=900-a; //USING LOCAL VALUE OF A
		
		int sub1=900-this.a; //USING GLOBAL VALUE OF A====USE THIS IF NAME OF LOCAL AND GLOBAL IS  SAME 
		
		
		System.out.println(sub);
		System.out.println(sub1);
	}
	
	public static void main(String[] args) {
		 
		A_ForSuperKeyword a=new A_ForSuperKeyword();
		
		a.test();
		
	}
}
