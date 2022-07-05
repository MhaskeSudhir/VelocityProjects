package inheritance;

public class Hierarchical_Inheritance_Study {

	public static void main(String[] args) {
		
		Mother m = new Mother();  //OBJECT CREATED FOR SUPER CLASS
		
		m.nature(); // CALLING SUPER CLASS'S OWN PROPERTY
		
		Son1 s1= new Son1();  // OBJECT CREATED FOR SUB-CLASS
		
		s1.nature();  // CALLING SUPER-CLASS (MOTHER) PROPERTY USING SUB-CLASS OBJECT
		
		s1.watch();  // CALLING SON1 (SUB-CLASS) OWN PROPERTY USING OWN OBJECT
		
		Daughter1 d1 = new Daughter1();  // OBJECT CREATED FOR SECOND SUB-CLASS
		
		d1.nature();  //CALLING SUPER CLASS PROPERTY USING SUB-CLASS OBJECT
		
		d1.scooty(); // CALLING OWN PROPERTY OF SUBCLASS
		
		// FOR STATIC MEHOD CALLING
		
		Daughter1.look();  // CALLING OWN STATIC METHOD OF SUBCLASS USING OWN CLASS NAME
		
		Daughter1.love();  // CALLING STATIC METHOD OF SUPER CLASS USING SUB-CLASS NAME
		
		Son1.money();  // CALLING OWN STATIC METHOD OF SUB-CLASS USING OWN CLASS NAME
		
		Son1.love();  // CALLING STATIC METHOD OF SUPER CLASS USING SUB-CLASS NAME
		
		Mother.love();  // CALLING OWN STATIC MEHOD SUPER CLASS

	}

}
