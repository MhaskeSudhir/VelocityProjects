package collectionInJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorStudy2 {

	public static void main(String[] args) {
		List v = new Vector();
		v.add("A");
		v.add("Z");
		v.add("Q");
		v.add("R");
		v.add("M");
		v.add("G");
		v.add("J");
		System.out.println("Elements of vector 1 "+v); //[A, Z, Q, R, M, G, J]
		
		Vector v1 = new Vector();
		v1.add(0, "D");
		v1.add("W");
		v1.add("E");
		v1.add("O");
		v1.addElement("T");
		System.out.println("Element of vector 2 : "+v1); //[D, W, E, O]
		
		//Adding all elements from vector 1 to vector 2
//		v1.addAll(0, v);
//		System.out.println("Adding all element at starting of Vector 2 from vector 1 : "+v1);  //[Vector 1 =A, Z, Q, R, M, G, J :vector2 = D, W, E, O]
//		v1.retainAll(v);
//		System.out.println("Retain all element from vector 1 in vector 2 and remove other : "+v1); //[A, Z, Q, R, M, G, J]
		v1.addAll(v);
		System.out.println("Adding all the element from vector 1 to vector 2 at last "+v1);  //[A, Z, Q, R, M, G, J, A, Z, Q, R, M, G, J]
		
		//Sorting-reverse sorting and shuffling
		Collections.sort(v1);
		System.out.println("After Sorting element from vector 2 : "+v1);  //[A, Z, Q, R, M, G, J, A, Z, Q, R, M, G, J]
		Collections.sort(v1, Collections.reverseOrder());
		System.out.println("After Sorting element from vector 2 in reverse order : "+v1); //[Z, Z, R, R, Q, Q, M, M, J, J, G, G, A, A]
//		Collections.shuffle(v1);
//		System.out.println("After Shuffling element from vector 2 : "+v1);
		
		//removing vector v from v1
		v1.removeAll(v);
		System.out.println("After removing vector v from vector v1 : "+v1);
		
		//copying vector into array and printing array
		String ar[] = new String[10];
		v1.copyInto(ar);
		System.out.println("Copy vector into array and printing array");
		for (int i=0; i<=ar.length-1; i++)
		{
			System.out.print(" "+ar[i]);
		}
		
		//Retriving elements from vector
		System.out.println("\nFirst element of vector v1 : "+v1.firstElement());
		System.out.println("Last element of vector v1 : "+v1.lastElement());
		System.out.println("Element at index 1 is : "+v1.elementAt(1));
		System.out.println("Index number of O is : "+v1.indexOf("O"));
		System.out.println("printing sublist from vector v1: "+v1.subList(0, 3));
		
		// Setting size of vector
		v1.setSize(20);
		System.out.println("new size of vector is : "+v1.size());
		
		System.out.println(v);
		//Converting array into Vector
		String str[]= {"do","vc","ac"};
		Vector v2 = new Vector(Arrays.asList(str));
		System.out.println("\n\nConverting array into Vector : "+v2);
				
		//Converting Vector into array
		System.out.println("\n\nConverting Vector into array");
		Object[] arr = v.toArray();
		for (int i=0; i<=arr.length-1; i++)
			{
			System.out.println(arr[i]);
			}

		
	}

}
