package logicalprograms;

public class Occurance {

	public static void main(String[] args) {
		
		String str="java selenium tools for software automation";
		
		int a=str.length();
		
		int b=str.replace("a","").length();
		
		System.out.println("OCCURANCE OF CHARACTER IS "+(a-b)+" TIMES");

	}

}
