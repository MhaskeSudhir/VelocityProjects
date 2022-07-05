package logicalprograms;

public class MissingNumbers {

	public static void main(String[] args) {
		// ARRAY SHOULD NOT CONTAINS ANY DUPLICATES
		// ARRAY NO NEED TO BE IN SORTED ORDER ---- CAN BE JUMBLED
		// ARRAY VALUES SHOULD BE IN RANGE MEANS HAS STARTING POINT AND ENDING POINT
		
		int number[]= {1,2,3,4,5,6,8,9,10,11};
		int realsum=0;
		int actualsum = 0;
		
		for(int i=1; i<=11; i++)
		{
			realsum=realsum+i;
		}
		
		System.out.println("SUM OF ALL NUMBER EXPECTED "+realsum);
		
		for(int j=0; j<=number.length-1;j++)
		{
			actualsum=actualsum+number[j];
		}
		System.out.println("SUM OF ALL NUMBER IN ARRAY WITH MISSING NUMBER "+actualsum);
		System.out.println("Missing Number is (EXPECTED RESULT-ACTUAL RESULT) =  "+(realsum-actualsum));
		
		
	}

	

}
