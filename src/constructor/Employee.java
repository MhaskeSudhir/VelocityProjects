package constructor;

public class Employee {

	public static void main(String[] args) {
		
		HR_Portal SachinT = new HR_Portal();  // Using "new"= Assigning Memory to Object; new as assigning operator
		
		SachinT.Emp_Name="Sachin";    //Here SachinT = Datatype ; Emp_Name = Variable name ; Sachin = Variable Value
		SachinT.Emp_ID=100;
		SachinT.Emp_Position="Developer";
		SachinT.Emp_Salary=120000.50f;
		SachinT.Emp_Gender='M';
		
		//Employee Info calling From HR_portal-----Calling Non-Static Method in another class
		
		SachinT.emp_info();
		
		// If new employee hired virat
		
		HR_Portal ViratK = new HR_Portal();
		
		ViratK.Emp_Name="Virat";
		ViratK.Emp_ID=101;
		ViratK.Emp_Position="Manager";
		ViratK.Emp_Salary=150000.245f;
		ViratK.Emp_Gender='M';
		
		ViratK.emp_info();

		//As Data Type are Non-Static Hence User Has Access to it
		// In one class we can Create many numbers of Objects
		// HR_Portal class is Data type User Defined------Class name is basically data type
		// Name of Object = Variable name-------Object is basically Data type name
		// new = Memory assign Operator
	}

}
