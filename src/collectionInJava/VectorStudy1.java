package collectionInJava;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy1 {

	public static void main(String[] args) {
		Vector  vec = new Vector();
		
		vec.add("Selenium");  
		vec.add(1, "Selenium");
		vec.add(33.33);       
		vec.add(15);          
		vec.add(null);        
		vec.add(null);
		vec.add(true);        
		vec.add('D');
		System.out.println("Retrive Vector element using simple for loop ");
		for(int i=0; i<=vec.size()-1; i++)
		{
			System.out.print(" "+vec.get(i));
		}
		
		System.out.println("\n\nRetrive Vector element using for each loop ");
		for(Object a:vec)
		{
			System.out.print(" "+a);
		}
		
		System.out.println("\n\nRetrive Vector element using iterator ");
		
		Iterator vect1 = vec.iterator();
		while (vect1.hasNext()) {
			System.out.print(" "+vect1.next());
		}
		
		System.out.println("\n\nRetrive Vector element using list iterator ");	
		ListIterator vec1 = vec.listIterator();
		
		while (vec1.hasNext()) {
			System.out.print(" "+vec1.next());
		}
		
		System.out.println("\n\nRetrive Vector element using enumeration ");
		
		Enumeration vec2 = vec.elements();
		
		while (vec2.hasMoreElements()) {
		System.out.print(" "+vec2.nextElement());	
		}
	}

}
