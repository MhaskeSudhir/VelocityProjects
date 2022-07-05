package generalization;

public class Jio implements TRAI 
{

	@Override
	public void call() {
		System.out.println("Jio call rates-----10 p/s");		
	}

	@Override
	public void message() {
		System.out.println("Jio Free message in a day------250 msg/day");
	}

	@Override
	public void data() {
		System.out.println("Jio data per day-----2.5 gb/day");
	}
	
	public void JioTV()  // OWN METHOD OF JIO COMPANY
	{
		System.out.println("JioTV free for jio customer");
	}

}
