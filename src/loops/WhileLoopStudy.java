package loops;

public class WhileLoopStudy {

	public static void main(String[] args) {
		// I WANT TO PRINT 1 TO 10 COUNT
		// 1. INITIALIZATION IS OUTSIDE WHILE LOOP
		
		int i=1;
		
		while(i<=10) // CONDITIONS= 1<=10, 2<=10, 3<=10..........10<=10,--11<=10 is false
		{
		System.out.println(i);
		
		i++;  // UPDATION 1-2-3-4-....10....11
		}
		
		System.out.println("WE ARE OUTSIDE WHILE LOOP");
		
		// IF WE FORGOT UPDATION IN WHILE LOOP---AND IF CONDITION IS ALWAYS TRUE THEN WHILE LOOP GOES IN INFINITIVE 

	}

}
