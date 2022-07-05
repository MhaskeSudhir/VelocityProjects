package logicalprograms;

public class LargestNoWithoutIfElse {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		
		//with math class method 
		int c=Math.max(a, b);
		System.out.println("max number is without if statement "+c);
		
		// with iternary operator
		
		int d=a>b?a:b;
		
		System.out.println("max number is with iternary operator "+d);

	}

}
