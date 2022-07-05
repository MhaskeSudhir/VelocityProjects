package collectionInJava;

import java.util.ArrayList;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("Data");
		v.add(188);
		v.add(null);
		v.add(null);
		v.add("Data");
		v.add(true);
		v.add('S');
		v.add(0.666);
		v.add("C%");
		System.out.println(v); //[Data, 188, null, null, Data, true, S, 0.666, C%]
		
		//printing size of Vector 
		System.out.println("Capacity of vector : "+v.capacity());
		System.out.println("size of vector is : "+v.size());     //9
		
		System.out.println("Index number of C% : "+v.indexOf("C%"));
		System.out.println("last index of null : "+v.lastIndexOf(null));
		System.out.println("last element is : "+v.lastElement());
		
		//removing element by index and direct
		v.remove(0);
		System.out.println(v);
	

		
		
	}

}
