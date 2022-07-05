package collectionsInJava2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy1 {

	public static void main(String[] args) {
		//HashSet hs= new HashSet(100);      //Initial capacity 100 and load factor/fill ratio by default 0.75
		//HashSet hs= new HashSet(100,(float)0.90);  //Initial capacity 100 and load factor/fill ratio 90 percent
		//HashSet<Integer> hs = new HashSet<Integer>();
		
		HashSet hs= new HashSet();   //default capacity 16 and load factor 0.75
		//Adding element in Hashset
		hs.add("Welcome");
		hs.add("Welcome");
		hs.add(null);
		hs.add(null);
		hs.add(199);
		hs.add(44.55);
		hs.add(true);
		hs.add('A');
		hs.add("year");
		hs.add("day");
		hs.add("trash");
		System.out.println(hs);  //[null, 44.55, A, year, 199, Welcome, day, true, trash]--insertion order not maintained
		                         // duplicate not allowed and only one null allowed
		
		//Remove
		hs.remove("trash");
		System.out.println("After removing element trash : "+hs);
		
		//Contains
		System.out.println("Is hash set contain 199 : "+hs.contains(199));
		
		// Is empty
		System.out.println("Is hash set is empty "+hs.isEmpty());
		
		//Reading objects/elements from hash set using for each loop
		System.out.println("\nReading hashset element using for each loop");
		for(Object value:hs)
		{
			System.out.print(" "+value);
		}
		
		//Reading objects/elements from hash set using iterator]
		System.out.println("\nReading hashset element using iterator");
		Iterator values = hs.iterator();
		while (values.hasNext()) {
			System.out.print(" "+values.next());
					}
		
		
		String str[]= {"do","vc","ac"};
		HashSet hs2 = new HashSet(Arrays.asList(str));
		System.out.println("\n\nConverting array into hash set : "+hs2);

		
	}

}
