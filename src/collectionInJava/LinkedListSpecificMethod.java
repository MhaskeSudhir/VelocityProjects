package collectionInJava;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListSpecificMethod {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		
		ll.add("Dog");
		ll.add("Cat");
		ll.add("Horse");
		ll.add("Tiger");
		ll.add("Zebra");
		ll.add("cat");
		System.out.println(ll);
		//Add firs and last
		ll.addFirst("Mango");
		ll.addLast("Apple");
		System.out.println("After adding element at first and last : "+ll);
		
		//for retriving first and last element
		System.out.println("First element of linked list is : "+ll.getFirst());
		System.out.println("Last element of linked list is : "+ll.getLast());
		
		//Removing first and last element of linked list
		ll.removeFirst();
		ll.removeLast();
		System.out.println("After removing first and last element of linked list : "+ll);
		
		
		//Converting array into Linkedlist
		String str[]= {"do","vc","ac"};
		LinkedList ll2 = new LinkedList(Arrays.asList(str));
		System.out.println("\n\nConverting array into Linked list : "+ll2);
		
		//Converting linkedlist into array
		System.out.println("\n\nConverting Linkedlist into array");
		Object[] arr = ll.toArray();
		for (int i=0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
