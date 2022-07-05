package method;

public class Test {

	public static void main(String[] args) {
		//to call Nonstatic method we need to create object
		//syntax for object  classname objectname = new classname
		
		Test t = new Test();    //object created
		
		t.method();  //calling Nonstatic method from same class syntax; objectname.methodname

		//to call Nonstatic method from another class 
		// Need Object of another class i.e. NonStatic
		
		NonStatic n = new NonStatic(); //created object for another class
		
		n.Method2();  //calling Nonstatic method from another class using object 'n'
		
	}
	
	public void method()  //Nonstatic method
	{
		int a=90, b=10;
		
		int sub=a-b;
		
		System.out.println("subtraction is "+sub);
		
	}

}
