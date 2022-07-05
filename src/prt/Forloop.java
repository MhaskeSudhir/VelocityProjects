package prt;

public class Forloop {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,5,6},{6,7,8}};
		
		System.out.println(arr[0][0]-arr[1][1]);
		
		//  ar starting no next line: for row i=0 ,column j=1,2,3    : arr.length-1 = 4-1=3
		// on next line: for row i=1, column j=1,2,3 
		// on next line: for row i=3, column j=1,2,3
		
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.print(arr[i][j]-arr[0][0]+" ");
			}
			System.out.println();
		}
		
		String mob[]= {"vivo","redmi","htc","iphone","oppo"};
		
		for(String mob1: mob) // for each loop
		{
			System.out.println(mob1);
		}

	}

}
