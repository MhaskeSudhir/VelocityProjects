package generalization;

public class Vodafone implements TRAI 
{

	@Override
	public void call() {
		System.out.println("Vodafone call rates-----30 p/s");
	}

	@Override
	public void message() {
		System.out.println("Vodafone free message per day----150 msg/day");
	}

	@Override
	public void data() {
		System.out.println("Vodafone data per day-------1 gb/day");
	}

	public void HelloTune()   // OWN METHOD OF VODAFONE COMPANY
	{
		System.out.println("Vodafone free Hello Tune for its customer");
	}
}
