package castingStudy;

public class UpCasting {

	public static void main(String[] args) {
		// NORMAL CALLING USING FATHERS OBJECT
		Father f = new Father();
		
		f.bike();
		f.car();
		
		// NORMAL CALLING USING SONS OBJECT
		Son s = new Son();
		
		s.bike();
		s.car();
		s.degree();
		
		// UP CASTING
		
		System.out.println("=======================================================");
		System.out.println("UP CASTING");
		System.out.println();
		
		Father f1 = new Son();  // F1 OBJECT'S DATATYPE IS FATHER---TAKES MEMORY FROM  SON
		
		f1.bike();  // UP CASTING ALLOWED TO CALL ONLY COMMON PROPERTY BETWEEN SUB CLASS AND SUPER CLASS
		f1.car();   // UP CASTING ALLOWED TO CALL ONLY COMMON PROPERTY BETWEEN SUB CLASS AND SUPER CLASS
		
		// CREATING OBJECT OF SUB CLASS AND GIVING REFERENCE OF SUPERCLASS
		
		// SYNTAX --- SUPERCLASSNAME OBJECTNAME = NEW SUBCLASSNAME();

	}

}
