package prt;

public class Intrv {

	public static void main(String[] args) {
		// REVERSING STRING AND CHECKING WHETHER IT IS PALINDROME OR NOT
		
		String name="Madam";
		String name1=name;
		
		StringBuilder rev = new StringBuilder(name);
		
		rev.reverse();
		
		String revs=rev.toString();
		
		System.out.println(revs);
		
		System.out.println("String is palindrom string true/false = "+revs.equalsIgnoreCase(name1));

	}

}
