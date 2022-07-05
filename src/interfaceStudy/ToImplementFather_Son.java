package interfaceStudy;

public class ToImplementFather_Son implements Son {
	
	// IMPLEMENTATION CLASS IMPLEMENTS INTERFACE SON

	public static void main(String[] args) {
		
		ToImplementFather_Son imfs = new ToImplementFather_Son();
		
		imfs.money();
		imfs.home();
		
		imfs.bike();
		imfs.mobile();

	}

	@Override
	public void money() {
		
		System.out.println("Money-Father Interface's property");
	}

	@Override
	public void home() {
		
		System.out.println("Home-Father Interface's property");
	}

	@Override
	public void bike() {
		
		System.out.println("Bike-Son Interface's property");
	}

	@Override
	public void mobile() {
	
		System.out.println("Mobile-Son Interface's Property");
	}

	
}
