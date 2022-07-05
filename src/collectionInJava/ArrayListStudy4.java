package collectionInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListStudy4 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println("Elements from al is : "+al);
		List al2 = new ArrayList();
		al2.add("G");
		al2.add("G");
		al2.add("H");
		al2.add("I");
		al2.add("J");
		System.out.println("Elements from al2 is : "+al2);
		//Add all
		al.addAll(al2);
		System.out.println("Adding all element from al2 to al : "+al);
		
		//containsall
		System.out.println("Is arrylist al contains all the element of al2 : "+al.containsAll(al2));
		
		//Remove all
		al.removeAll(al2);
		System.out.println("Removing al2 from al : "+al);
		
		//sort and reverse
		Collections.sort(al);
		System.out.println("Sorting elements from al : "+al);
		Collections.reverse(al);
		System.out.println("After sorting element in reverse order of al "+al);
		
		Collections.shuffle(al);
		System.out.println("After shuffling elements in al is : "+al);
		
		//Converting array into array list
		String al3[]= {"AB","AC","AD"};
		System.out.println("Elements of array is :");
		for(String value:al3)
		{
			System.out.print(" "+value);
		}
		ArrayList al4= new ArrayList(Arrays.asList(al3));
		System.out.println("\nAfter Converting array into array list : "+al4);	
		
		//Converting array into arraylist
		String str[]= {"do","vc","ac"};
		ArrayList arraylist2 = new ArrayList(Arrays.asList(str));
		System.out.println("\n\nConverting array into arraylist : "+arraylist2);
		
		//Converting arraylist into array
		Object[] arr = al.toArray();
		for (int i=0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}

		
		

	}

}
