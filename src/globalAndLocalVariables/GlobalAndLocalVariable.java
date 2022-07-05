package globalAndLocalVariables;

public class GlobalAndLocalVariable {
	int a=10;     // NON-STATIC GLOBAL VARIABLE
    int b=20;     // NON-STATIC GLOBAL VARIABLE
    
    static int c=30;   // STATIC GLOBAL VARIABLE--ITALIC FONT
    static int d=40;   // STATIC GLOBAL VARIABLE --ITALIC FONT
    
    
    public void addition()  // NON-STATIC METHOD
    {
    	// IN NON-STATIC METHOD BOTH VARIABLE STATIC AND NON-STATIC ALLOWED
    	// NON-STATIC METHOD = STATIC VARIABLE + NON-STATIC VARIABLE
    	
    	int sum1=a+b;   // HERE SUM1 AND SUM2 ARE NON-STATIC LOCAL VARIABLES
    	int sum2=c+d;   //IN NONSTATIC METHOD WE CAN USE BOTH STATIC AND NONSTATIC VARIABLES
    	
    	System.out.println("addition of non-static variable a and b in non-static method is "+sum1);
    	System.out.println("addition of static variable c and d in non-static method is "+sum2); 	
    }
    
    public static void sub()  // STATIC METHOD
    {
    	// STATIC VARIABLE = STATIC METHOD ; NON-STATIC VARIABLE NOT ALLOWED IN STATIC METHOD
    	// YOU CAN NOT CALL OR USE NON-STATIC VARIABLE IN STATIC METHOD 
    	// int sub=a-b; HERE A AND B ARE NON-STATIC VARIABLE
    	
    	int sub=c-d;   // CALLED STAIC VARIABLE IN STATIC METHOD---STATIC VARIABLE HAS ITALIC FONT
    	
    	System.out.println("Substraction of Static variable c and d in static method is "+sub);
    }

    public static void main(String[] args) 
	{
     GlobalAndLocalVariable gl= new GlobalAndLocalVariable(); // OBJECT CREATED FOR NON-STATIC METHOD ADDITION()
     
     gl.addition(); //CALLINT NON-STATIC METHOD USING OBJECT OF SAME CLASS
     
     System.out.println("===============================================================");
     
     sub(); //CALLING STATIC METHOD FROM SAME CLASS
     
     //  STATIC VARIABLE CANNOT DECLARE LOCALLY
     // STATIC VARIABLE IS ALWAYS GLOBAL
	}

}
