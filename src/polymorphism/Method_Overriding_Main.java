package polymorphism;

public class Method_Overriding_Main {

	public static void main(String[] args) {
		
		Method_Overriding1 mo1 = new Method_Overriding1();  
		
		Method_Overriding2 mo2 = new Method_Overriding2();
		
		// METHOD() IS SAME METHOD NAME USED IN BOTH SUPER AND SUB CLASS
		// BASED ON OBJECT CREATION AS OBJECT NAME ARE DIFFERENT BUT METHOD NAME IS SAME
		
		mo1.method(); // BINDING OF METHOD DECLARATION AND METHOD DEFINITION TAKE PALCE AT EXECUTION TIME
		
		mo2.method();  // BINDING OF METHOD DECLARATION AND METHOD DEFINITION TAKE PALCE AT EXECUTION TIME

	}

}
