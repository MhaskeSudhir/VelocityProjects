package collectionsInJava2;


import java.util.LinkedHashSet;

public class LinkedHashSetStudy3 {

	public static void main(String[] args) {
		//Union, Intersection, difference
		
				LinkedHashSet<Integer> num1 = new LinkedHashSet<Integer>();
				
				num1.add(1);
				num1.add(2);
				num1.add(3);
				num1.add(4);
				num1.add(5);
				num1.add(6);
				System.out.println(num1);
				
				LinkedHashSet<Integer> num2 = new LinkedHashSet<Integer>();
				num2.add(4);
				num2.add(6);
				num2.add(5);
				num2.add(1);
				num2.add(2);
				num2.add(3);
				System.out.println(num2);
				
				//Union
//				num1.addAll(num2);
//				System.out.println("Union : "+num1);
				
				//Intersection
//				num1.retainAll(num2);
//				System.out.println("Intersection : "+num1);
				
				//Difference
//				num1.removeAll(num2);
//				System.out.println("Difference : "+num1);
				
				//Subset
				
//				System.out.println(num1.containsAll(num2));


	}

}
