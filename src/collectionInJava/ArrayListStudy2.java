package collectionInJava;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Selenium");  
		al.add(1, "Selenium");
		al.add(33.33);       
		al.add(15);          
		al.add(null);        
		al.add(null);
		al.add(true);        
		al.add('D'); 
		//printing size of arraylist
		System.out.println(al);            //[Selenium, Selenium, 33.33, 15, null, null, true, D]
		System.out.println("Nember of elements in arraylist : "+al.size());     //8
		
		//removing element by index and direct
		al.remove(5); //here 5 is index number
		al.remove(null); //here null is element
		System.out.println("After removing elements "+al);           //[Selenium, Selenium, 33.33, 15, true, D]
		
		//Retrieve specific element
		System.out.println("Retrieve specific element by get is : "+al.get(2)); //33.33
		
		//Change element--replace element
		al.set(4, "Testing");
		al.set(5,"automation");
		System.out.println("After replacing elements : "+al);
		
		//Insert element between list-----add(index,object)
		al.add(3, "oops");
		System.out.println("After inserting element : "+al);
		
		//to search particular element----contains()----Returns True/False
		System.out.println("Is arraylist al contains oops : "+al.contains("oops"));
		
		//IsEmpty-----check whether arraylist is empty returns true if empty---returns false if contains elements
		System.out.println("Is arraylist al empty :"+al.isEmpty());
		ArrayList empty= new ArrayList();
		System.out.println("Is newly created arraylist is empty : "+empty.isEmpty());

	}

}
