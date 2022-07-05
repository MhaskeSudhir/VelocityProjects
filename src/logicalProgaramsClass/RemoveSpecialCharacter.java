package logicalProgaramsClass;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String str="CHAR$%&* *^%%Remove";
		
		System.out.println(str.replaceAll("[^a-zA-Z0-9 ]", ""));

		
		String str1="AB  &^*@$  CD";
		
		System.out.println(str1.replaceAll("[^A-D ]", ""));
	}

}
