package collectionsInJava2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetStudy3 {

	public static void main(String[] args) {
		//Union, Intersection, difference
		
		HashSet<Integer> num1 = new HashSet<Integer>();
		
		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		num1.add(5);
		num1.add(6);
		System.out.println(num1);
		
		HashSet<Integer> num2 = new HashSet<Integer>();
		num2.add(4);
		num2.add(6);
		num2.add(5);
		num2.add(1);
		num2.add(2);
		num2.add(3);
		System.out.println(num2);
		
		//Union
//		num1.addAll(num2);
//		System.out.println("Union : "+num1);
		
		//Intersection
//		num1.retainAll(num2);
//		System.out.println("Intersection : "+num1);
		
		//Difference
//		num1.removeAll(num2);
//		System.out.println("Difference : "+num1);
		
		//Subset
		
		System.out.println(num1.containsAll(num2));
		
		//Converting array into HashSet
		String str[]= {"do","vc","ac"};
		HashSet hs2 = new HashSet(Arrays.asList(str));
		System.out.println("\n\nConverting array into Hashset : "+hs2);
		
		//Converting HashSet into array
		System.out.println("\n\nConverting Hashset into array");
		Object[] arr = num1.toArray();
		for (int i=0; i<=arr.length-1; i++)
			{
			System.out.println(arr[i]);
			}


	}

}
