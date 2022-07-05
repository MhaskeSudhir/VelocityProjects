package globalAndLocalVariables;

public class Sample 
{
    int m=100;           //GLOBAL NON STATIC VARIABLE
    static int n=200;    //GLOBAL STATIC VARIABLE
    
    public void display1()   // NON STATIC METHOD
    {
    	System.out.println("I am Non-Static Method (display1) From Sample class");
    }
    
    public static void display2() //STATIC METHOD
    {
    	System.out.println("I am Static Method (display2) From Sample Class");
    }
}
