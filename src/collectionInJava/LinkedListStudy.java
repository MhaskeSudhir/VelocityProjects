package collectionInJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		//Declare linked list
		//LinkedList<Integer> ll1= new LinkedList<Integer>();

		LinkedList ll=new LinkedList();
		
		//add elements into linked list
		ll.add("trash");
		ll.add("trash");
		ll.add(100);
		ll.add(null);
		ll.add(null);
		ll.add("duplicate");
		ll.add("duplicate");
		ll.add("empty");
		ll.add(22.44);
		ll.add(true);
		ll.add(10,"trash");
		ll.add("trash");
		System.out.println("elements in ll Linked list : "+ll); //[trash, trash, 100, null, null, duplicate, duplicate, empty, 22.44, true, trash, trash]
		
		//size of linked list
		System.out.println("Size of linked list ll : "+ll.size());
		
		//remove
		ll.remove();   //remove first element from linked list
		ll.removeFirst(); //remove first element from linked list
		ll.remove(6);   //remove by index number
		ll.removeFirstOccurrence("empty"); //remove first occurance of empty
		ll.removeLast(); //remove last element
		ll.removeLastOccurrence("trash");  //remove last occurance of trash
		System.out.println("elements in ll Linked list : "+ll);  //[100, null, null, duplicate, duplicate, true]
		
		//Replace element of linked list
		ll.set(5, false);
		System.out.println("elements in ll Linked list : "+ll); //[100, null, null, duplicate, duplicate, false]
		
		//retriving specific element
		System.out.println("retriving first element using getfirst : "+ll.getFirst());
		System.out.println("retriving last element using getlast : "+ll.getLast());
		System.out.println("retriving specific element using get(index) : "+ll.get(3));
		
		//contains---element present in linked list or not
		System.out.println("element false contain in linked list : "+ll.contains(false));
		
		//is empty
		System.out.println("is linked list empty : "+ll.isEmpty());
		
		//Reading element from linked list using for loop
		System.out.println("\nretriveing element from linked list using for loop");
		for (int i=0; i<=ll.size()-1; i++)
		{
			System.out.print(" "+ll.get(i));
		}
		
		//Reading element from linked list using iterator
		System.out.println("\n\nretriving element from linked list using iterator");
		Iterator values = ll.iterator();
		while(values.hasNext())
		{
			System.out.print(" "+values.next());
		}
		
		//Reading element from linked list using for each loop
		System.out.println("\n\nReading element from linked list using for each loop");
		for(Object li:ll)
		{
			System.out.print(" "+li);
		}
		
		//Reading element from linked list using list iterator
		System.out.println("\n\nReading element from linked list using list iterator");
		ListIterator val = ll.listIterator();
		while(val.hasNext())
		{
			System.out.print(" "+val.next());
		}
	}

}
