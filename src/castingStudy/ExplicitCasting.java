package castingStudy;

public class ExplicitCasting {

	public static void main(String[] args) {
		
		// CONVERSION--- HIGHER DATATYPE TO LOWER DATATYPE
	    // MEMORY DECREASING--NARROWING CASTING
		// DATA LOSS TAKES PLACE
				
		// DOUBLE TO INT --- CONVERSION
				
		double b=145.665444d;
		
		int a=(int) b;
		
		System.out.println("Value of double b is "+b);
		
		System.out.println("Value of casted int a is (double b converted to int a) "+a+" digits after decimal 0.665444 lost");
		
		

	}

}
