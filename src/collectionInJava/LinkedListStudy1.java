package collectionInJava;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListStudy1 {

	public static void main(String[] args) {
		List ll= new LinkedList();
		
		ll.add('A');
		ll.add('C');
		ll.add('D');
		ll.add('B');
		ll.add('Z');
		ll.add('X');
		System.out.println("Element in linked list : "+ll);
		LinkedList new_ll= new LinkedList();
		new_ll.add('K');
		new_ll.add('G');
		new_ll.add('F');
		System.out.println("Element in new linked list : "+new_ll);
		
		
		//adding all elements from linked list to new linked list two times
		new_ll.addAll(ll);
		new_ll.addAll(ll);
		System.out.println("After adding elements from linked list to new linked list two times : "+new_ll);
		
		Collections.sort(new_ll);
		System.out.println("After sorting elements from new linked list : "+new_ll);
		
		Collections.shuffle(new_ll);
		System.out.println("After shuffling elements from new linked list : "+new_ll);
		
		Collections.sort(new_ll,Collections.reverseOrder());
		System.out.println("After sorting elements from new linked list in reverse order : "+new_ll);
		
		new_ll.removeAll(ll);
		System.out.println("After removing all elements from new linked list which are same as linked list : "+new_ll);
		
		new_ll.clear();
		System.out.println("After clear() method on new_ll : "+new_ll);

	}

}
