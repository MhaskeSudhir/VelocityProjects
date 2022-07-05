package logicalprograms;

public class ReplaceAllMethod {

	public static void main(String[] args) {
		String str="%&%^%$^%*&*&685754 java selenium";
		
		String str1=str.replaceAll("[^a-zA-Z0-9]", "");  // ^ is char operator---don't remove a-z,A-Z,0-9 and replace all other with = ""

		System.out.println(str1);
	}

}
