package abstract_class;

public class Concrete_Class extends Test
{

	public static void main(String[] args) {
		
		// TO CREATE  OBJECT OF ABSTRACT CLASS WE NEED TO MAKE USE OF CONCRETE CLASS
		// CONCRETE CLASS PROVIDE BODY TO INCOMPLETE METHOD IN ABSTRACT CLASS
		
		Concrete_Class cc =new Concrete_Class();
		
		cc.test_incomplete();  // THIS METHOD COMPLETED IN CONCRETE CLASS USED BY INHERITANCE
		
		cc.test1_complete();  // THIS METHOD COMPLETED ALREADY IN TEST CLASS USED BY INHERITANCE

		cc.test2();
		cc.test();
	}

	
	@Override
	public void test_incomplete() 
	{
		System.out.println("INCOMPLETE METHOD 'TEST' OF ABSTRACT CLASS COMPLETED IN CONCRETE CLASS");	
	}


	@Override
	public void test2() {
		System.out.println("ANOTHER EXAMPLE");
		
	}

}
