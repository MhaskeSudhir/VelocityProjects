package collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistStudy3 {

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
		System.out.println("Retrive arrayList element using simple for loop ");
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.print(" "+al.get(i));
		}
		
		System.out.println("\n\nRetrive arrayList element using for each loop ");
		for(Object a:al)
		{
			System.out.print(" "+a);
		}
		
		System.out.println("\n\nRetrive arrayList element using iterator ");
		
		Iterator arrlist = al.iterator();
		while (arrlist.hasNext()) {
			System.out.print(" "+arrlist.next());	
		}
		
		System.out.println("\n\nRetrive arrayList element using list iterator ");
		
		ListIterator lit = al.listIterator();
		
		while (lit.hasNext()) {
			System.out.print(" "+lit.next());
		}

	}

}
