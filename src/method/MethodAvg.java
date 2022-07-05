package method;

public class MethodAvg {

	public static void main(String[] args) 
	{
		//Average calculation using Nonstatic Method
		
		MethodAvg ma = new MethodAvg();  // Object created ma
		
		ma.result(); //calling Nonstatic method using objectname; Nonstatic Method Normal font
		
		studentinfo();  // Static Method Calling in Same class; Static Method Italic font
	

	}

	public void result()  //Non Static Method without parameter
	{
		int sub1=89, sub2=90, sub3=77;
		int total=sub1+sub2+sub3;
		
		int avg=total/3;
		
		System.out.println("my result is "+avg);
	}
	
	public static void studentinfo()  //Static Method Without Parameter
	{
		// Name,Roll no,Mob,Age,Batch,Gender
		
		String name="Velocity";
		int rollno=22;
		String mobno="8208765811";  //for mobno String is used If Float or int used It can be round off the value entered
		float age=29.5f;
		int batch=10;
		char gender='M';
		
		System.out.println("=========================");
		System.out.println("My name is "+name);
		System.out.println("My Roll no is "+rollno);
		System.out.println("My Mobile Number is "+mobno);
		System.out.println("My Age is "+age);
		System.out.println("My Batch is "+batch);
		System.out.println("My Gender is "+gender);
		System.out.println("==========================");
		
	}
	
	
}
