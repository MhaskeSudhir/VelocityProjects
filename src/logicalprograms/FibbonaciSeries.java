package logicalprograms;

public class FibbonaciSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8
		 
		int a=0; // initially a=0
		int b=1;  // initially b=`
		int c;   // to store addition of a and b 
		int terms=10; // number of terms to print fibbobaci series
		
		for(int i=0 ; i<=terms ; i++)  // i from 0 to 10
		{
			System.out.print(a+" ");  // a= 0 ,1,-+ g
			c=a+b; // c= 0+1=1,
			a=b;  // b=1 stored in a,
			b=c; // c=1 stored in b,
		}
	}
}
