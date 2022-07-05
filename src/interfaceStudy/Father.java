package interfaceStudy;

public interface Father {

	// INTERFACE EXTENDS INTERFACE
	// CLASS EXTENDS CLASS
	// INTERFACE EXTENDS CLASS & CLASS EXTENDS INTERFACE ---- NOT POSSIBLE
	
	// CLASS IMPLEMENTS INTERFACE
	
	void money();
	
	void home();
	
	default void love()   // IF METHOD NAME SAME--MAKE IT DEFAULT AND PROVIDE BODY IN INTERFACE
	{
		System.out.println("Father's Love");
	}
}
