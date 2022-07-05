package collectionsInJava2;


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy1 {

	public static void main(String[] args) {
				LinkedHashSet lhs= new LinkedHashSet(100);      //Initial capacity 100 and load factor/fill ratio by default 0.75
				//LinkedHashSet lhs= new LinkedHashSet(100,(float)0.90);  //Initial capacity 100 and load factor/fill ratio 90 percent
				//LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
				
				//HashSet hs= new HashSet();   //default capacity 16 and load factor 0.75
				//Adding element in Hashset
				lhs.add("Welcome");
				lhs.add("Welcome");
				lhs.add(null);
				lhs.add(null);
				lhs.add(199);
				lhs.add(44.55);
				lhs.add(true);
				lhs.add('A');
				lhs.add("year");
				lhs.add("day");
				lhs.add("trash");
				System.out.println(lhs);  //[Welcome, null, 199, 44.55, true, A, year, day, trash]--insertion order maintained
				                         // duplicate not allowed and only one null allowed
				
				//Remove
				lhs.remove("trash");
				System.out.println("After removing element trash : "+lhs);
				
				//Contains
				System.out.println("Is Linked hash set contain 199 : "+lhs.contains(199));
				
				// Is empty
				System.out.println("Is Linked hash set is empty "+lhs.isEmpty());
				
				//Reading objects/elements from hash set using for each loop
				System.out.println("\nReading Linked hashset element using for each loop");
				for(Object value:lhs)
				{
					System.out.print(" "+value);
				}
				
				//Reading objects/elements from hash set using iterator]
				System.out.println("\nReading Linked hashset element using iterator");
				Iterator values = lhs.iterator();
				while (values.hasNext()) {
					System.out.print(" "+values.next());
							}
				
				String str[]= {"do","vc","ac"};
				LinkedHashSet lhs2 = new LinkedHashSet(Arrays.asList(str));
				System.out.println("\n\nConverting array into linked hash set : "+lhs2);
				
	}

}
