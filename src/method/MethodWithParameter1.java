package method;

public class MethodWithParameter1 {

	public static void main(String[] args)
	{
		//Student Info is= name, Rollno, Mob No, Age, Batch, Gender
		/*in Parameter Method we can call same Method with 
		 * assigning different Value to same variables
		 * i.e. we can assign different value to variable when calling
		 */
		
		MethodWithParameter1 mwp = new MethodWithParameter1(); //created object mwp
		
		mwp.studentinfo("Velocity",22,"8208765811",29.5f,7,'M'); //calling with initializing variable with different value
		mwp.studentinfo("kishor",10,"4748584877",23.2f,12,'M');

	}
	
	public void studentinfo(String name,int rollno,String mobno,float age,int batch,char gender)
	{
		System.out.println("======================================");
		System.out.println("My Name Is "+name);
		System.out.println("My Roll No Is "+rollno);
		System.out.println("My Mobile Number Is "+mobno);
		System.out.println("My Age Is "+age);
		System.out.println("My Batch Is "+batch);
		System.out.println("My Gender Is "+gender);
		System.out.println("======================================");
	}

}
