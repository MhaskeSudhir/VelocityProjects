package collectionInJava3;

import java.util.PriorityQueue;

public class PriorityQueueStudy {

	public static void main(String[] args) {
		PriorityQueue p= new PriorityQueue();
		
		p.add("Monkey");
		p.add("Dog");
		p.add("Monkey");
		p.add("Cat");
		p.add("Elephant");
		p.add("tiger");    
		p.offer("zebra");
		p.add("money");
		//p.add(12);
		//p.add(null);
		System.out.println(p); //duplicate allowed-----heterogenous data not allowed ClassCastException---null not allowed NullPointerException
		                        //Insertion order - Ascending
		
		
		System.out.println(p.remove());  ////Get first element and remove it----throw NoSuchElementException if no element present
		System.out.println(p);
		System.out.println(p.poll()); //Get first element and remove it----throw null if no element present
		System.out.println(p);
		System.out.println(p.peek());  //Get first element and not remove it  ---Throw null if no element present
		System.out.println(p);
		System.out.println(p.element());  //get first element and not remove----Throw NoSuchElementException if no element present
		System.out.println(p);
		
		p.add("money");

	}

}
