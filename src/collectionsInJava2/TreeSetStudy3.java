package collectionsInJava2;


import java.util.TreeSet;

public class TreeSetStudy3 {

	public static void main(String[] args) {
		TreeSet<Integer> enumber = new TreeSet<Integer>();
		enumber.add(2);
		enumber.add(4);
		enumber.add(6);
		enumber.add(8);
		enumber.add(10);
		enumber.add(12);
		enumber.add(14);
		System.out.println(enumber);
		
		TreeSet<Integer> enumber1= new TreeSet<Integer>();
		enumber1.add(16);
		enumber1.add(18);
		enumber1.add(20);
		enumber1.add(22);
		System.out.println(enumber1);
		
		enumber1.addAll(enumber);
		System.out.println("After adding all element from enumber to enumber1 : "+enumber1);
		
		enumber1.removeAll(enumber);
		System.out.println("After removing all element from enumber1 which are added from enumber\n"+enumber1);
		
		enumber1.addAll(enumber);
		System.out.println("After adding all element from enumber to enumber1 : "+enumber1);
		enumber1.retainAll(enumber);
		System.out.println("Retaining element from enumber into enumber1 : "+enumber1);


	}

}
