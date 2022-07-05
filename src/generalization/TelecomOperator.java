package generalization;

public class TelecomOperator {

	public static void main(String[] args) {
		Airtel a = new Airtel();
		
		Jio j = new Jio();
		
		Vodafone v = new Vodafone();
		
		a.call();
		a.message();
		a.data();
		a.AirtelBank();
		System.out.println("Airtel SIM card rates = "+Airtel.SIMcard+" Rs");
		System.out.println();
		System.out.println("=========================================================");
		
		j.call();
		j.message();
		j.data();
		j.JioTV();
		System.out.println("Jio SIM card rates = "+Jio.SIMcard+" Rs");
		System.out.println();
		System.out.println("=========================================================");
		
		v.call();
		v.message();
		v.data();
		v.HelloTune();
		System.out.println("Vodafone SIM card rates = "+Vodafone.SIMcard+" Rs");
		System.out.println();
		System.out.println("=========================================================");
		
	//	Airtel.SIMcard=Airtel.SIMcard+10;---------- CANT CHANGE VALUE AS VARAIBLES IN INTERFACE ARE FINAL AND STATIC

	}

}
