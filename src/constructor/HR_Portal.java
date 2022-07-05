package constructor;

public class HR_Portal //Method Created to Reuse by Constructor
{
// Employee Info; Name, Employee ID, Salary, Position( QA, Developer, Manager, HR),Employees Gender
	
	String Emp_Name;
	int Emp_ID;
	Float Emp_Salary;
	String Emp_Position;
	char Emp_Gender;
	
	public void emp_info()
	{
		System.out.println("===================================");
		System.out.println("Employee Name = "+Emp_Name);
		System.out.println("Employee ID = "+Emp_ID);
		System.out.println("Employee Salary = "+Emp_Salary);
		System.out.println("Employee Position = "+Emp_Position);
		System.out.println("Employee Gender = "+Emp_Gender);
		System.out.println("====================================");
	}
}
