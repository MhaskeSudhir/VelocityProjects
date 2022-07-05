package interfaceStudy;

public class Daughter implements Father,Mother {

	public static void main(String[] args) {
		
		Daughter d = new  Daughter();
		
		d.look();
		d.nature();
		
		d.money();
		d.home();
		
		d.love();
	}
	
	//  MOTHER INTERFACE'S METHOD COMPLETED HERE

	@Override
	public void look() {
		
		System.out.println("Mother's Look");
	}

	@Override
	public void nature() {
		
		System.out.println("Mother's Nature");
	}
	
	// FATHER INTERFACE'S METHOD COMPLETED HERE

	@Override
	public void money() {
		
		System.out.println("Father's Money");
	}

	@Override
	public void home() {
		
		System.out.println("Father's Home");
	}

	@Override
	public void love() {
		
		//SYNTAX----INTERFACENAME.SUPER.DEFAULTMETHODNAME
		
		// DEFAULT METHOD IN INTERFACE STARTED FROM JAVA 8--DEFAULT METHOD IN INTERFACE CAN HAVE BODY
		
		Father.super.love();  // CALLING COMPLETE,DEFAULT METHOD FROM FATHER INTERFACE
		Mother.super.love();  // CALLING COMPLETE,DEFAULT METHOD FROM MOTHER INTERFACE
	}
	
	

}
