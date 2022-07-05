package generalization;

public class Airtel implements TRAI 
{
	// Airtel implemented all the services provided by TRAI

	@Override
	public void call() 
	{
		System.out.println("Airtel call rates---50 p/s");
	}

	@Override
	public void message() 
	{
		System.out.println("Airtel free messages----200 msg/day");	
	}

	@Override
	public void data() 
	{
		System.out.println("Airtel data in a day--------1.5 gb/d");
	}
	
	//SIMcard=SIMcard+10;-----not allowed to change simcard value decided by TRAI
	
	public void AirtelBank()  // OWN METHOD OF AIRTEL COMPANY
	{
		System.out.println("Airtel Bank service for airtel customer");
	}

}