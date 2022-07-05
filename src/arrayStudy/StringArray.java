package arrayStudy;

public class StringArray {

	public static void main(String[] args) {
		// I WANT TO STORE NAMES OF 5 STUDENT USING ARRAY AND  I WANT TO STORE GRADES OF 4 STUDENTS
		
		String name[]= {"Aditya","Vijay","Rajesh","Akash","Akshay"};
		char grades[]= {'A','B','C','D','A'};
		
		for(int i=0; i<=4; i++)
		{
			System.out.println(name[i]+" has grade "+grades[i]);
		}

		// I WANT TO STORE SALARY OF 5 STAFF AND PRINT THEIR SALARY 
		
		int salary[] = {10000,20000,30000,40000,50000};
						
		for(int i=0; i<=4; i++)
		{
			System.out.println("Salary of staff "+i+" is "+salary[i]);
		}
		
		// I WANT TO PRINT BIKES NAME USING FOR EACH LOOP
		
		String bikes[]= {"PULSAR","HORNET","PLATINA","DISCOVER","BULLET"};
		
		for(String bik:bikes)
		{
			System.out.println("bikes name are "+bik);
		}
	}

}
