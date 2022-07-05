package collectionsInJava2;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy1 {

	public static void main(String[] args) {
				//TreeSet<Integer> ts = new TreeSet<Integer>();
				
				TreeSet ts= new TreeSet();
				//Adding element in Hashset
				ts.add("Welcome");
				ts.add("Welcome");
				ts.add("to");
				ts.add("Selenium");
				ts.add("programming");
				ts.add("java");
				ts.add("year");
				ts.add("day");
				ts.add("trash");
				System.out.println(ts);  //[null, 44.55, A, year, 199, Welcome, day, true, trash]--insertion order not maintained
				                         // duplicate not allowed and only one null allowed
				
				//Remove
				ts.remove("trash");
				System.out.println("After removing element trash : "+ts);
				
				//Contains
				System.out.println("Is hash set contain java : "+ts.contains("java"));
				
				// Is empty
				System.out.println("Is hash set is empty "+ts.isEmpty());
				
				//Reading objects/elements from hash set using for each loop
				System.out.println("\nReading hashset element using for each loop");
				for(Object value:ts)
				{
					System.out.print(" "+value);
				}
				
				//Reading objects/elements from hash set using iterator]
				System.out.println("\nReading hashset element using iterator");
				Iterator values = ts.iterator();
				while (values.hasNext()) {
					System.out.print(" "+values.next());
							}
				
				//Converting array into treeset
				String str[]= {"do","vc","ac"};
				TreeSet ts2 = new TreeSet(Arrays.asList(str));
				System.out.println("\n\nConverting array into Tree set : "+ts2);
				
				//Converting treeset into array
				System.out.println("\n\nConverting treeset into array");
				Object[] arr = ts.toArray();
				for (int i=0; i<=arr.length-1; i++)
				{
					System.out.println(arr[i]);
				}


	}

}
