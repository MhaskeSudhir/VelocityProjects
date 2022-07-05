package collectionsInJava2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetStudy2 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> enumber = new LinkedHashSet<Integer>();
		enumber.add(2);
		enumber.add(4);
		enumber.add(6);
		enumber.add(8);
		enumber.add(10);
		enumber.add(12);
		enumber.add(14);
		System.out.println(enumber);
		
		LinkedHashSet<Integer> enumber1= new LinkedHashSet<Integer>();
		enumber1.add(16);
		enumber1.add(18);
		enumber1.add(20);
		enumber1.add(22);
		System.out.println(enumber1);
		
		enumber1.addAll(enumber);
		System.out.println("After adding all element from enumber to enumber1 : "+enumber1);
		
		enumber1.removeAll(enumber);
		System.out.println("After removing all element from enumber1 which are added from enumber\n"+enumber1);
		
		enumber1.addAll(enumber);
		System.out.println("After adding all element from enumber to enumber1 : "+enumber1);
		enumber1.retainAll(enumber);
		System.out.println("Retaining element from enumber into enumber1 : "+enumber1);
		
		
		//Converting array into Linked HashSet
		String str[]= {"do","vc","ac"};
		LinkedHashSet lhs2 = new LinkedHashSet(Arrays.asList(str));
		System.out.println("\n\nConverting array into Linked HashSet : "+lhs2);
				
		//Converting linkedHashSet into array
		System.out.println("\n\nConverting LinkedHashSet into array");
		Object[] arr = enumber1.toArray();
		for (int i=0; i<=arr.length-1; i++)
			{
			System.out.println(arr[i]);
			}



	}

}
