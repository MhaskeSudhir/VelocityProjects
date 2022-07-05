package collectionInJava;

import java.util.ArrayList;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		//ArrayList<String> al1=new ArrayList<String>();
		
		ArrayList al=new ArrayList();
		
		al.add("Selenium");  //string
		al.add("Selenium");
		al.add(2, "Selenium");
		al.add(33.33);       //float
		al.add(15);          //int
		al.add(null);        //null
		al.add(null);
		al.add(true);        //boolean
		al.add('D');         //Char
		
		
		System.out.println(al);
		
		Object value = al.get(0);
		System.out.println("Value at index 0 and index 1 are equal :"+value.equals(al.get(1)));
		
		System.out.println("Values at index 1 and index 3 are equal : "+al.get(1).equals(al.get(3)));
		
		System.out.println("First index of Selenium is : "+al.indexOf("Selenium"));
		System.out.println("Last index of Selenium is : "+al.lastIndexOf("Selenium"));
		}
}
