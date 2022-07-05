package stringMethods;

public class StringClassStudy2 {

	public static void main(String[] args) {
		
		System.out.println("STUDY OF SUB-STRING METHOD OF STRING CLASS================================");
		// SUBSTRING METHOD STUDY OF STRING CLASS
		// PART OF STRING ARE CUT OUT FROM FULL STRING
		
		String z="Indian Human Resource Development";
		
		System.out.println("Indian Human Resource Development cutted as "+z.substring(13));
		
		// FOR START AND END INDEX 
		
		System.out.println("Indian Human Resource Development parted as "+z.substring(13, 22));
		// IT GOES TO WARDS INDEX-1 SO NEED TO ENTER INDEX+1 ALREADY TO TAKE COMPLETE WORD
		// INDEX 13=R AND INDEX 21=e ------ LAST VALUE 22 IS TAKEN TO GET 22-1=21

		//STUDY CONCATE METHOD OF STRING CLASS
		// CONCATE JOINS TWO STATEMENT OR STRINGS
		System.out.println("STUDY OF CONCATE METHOD OF STRING CLASS========================");
		
		String a="STATE";
		String b="MENT";
		
		System.out.println("Joining of STATE and MENT using concate method is "+a.concat(b));
		
		// OR WE CAN DIRECTLY TYPE STATEMENT WHICH HAS TO JOIN
		
		System.out.println(a.concat(" IS MAHARASHTRA = DIRECTLY JOINING STATEMENT"));
		
		String d=a.concat(b);
		
		System.out.println("stored value in d variable for future use is "+d);
		
		//STUDY INDEX OF METHOD OF STRING CLASS
		System.out.println("STUDY OF INDEX OF METHOD OF STRING CLASS===================================");
		
		// for first occurance of character
		
		String p="AAABBBCCCDDD";
		String q="AaAbBbCcCdDd";
		
		System.out.println("INDEX OF FIRST OCCURED A IS "+p.indexOf('A')); // ONLY FIRST OCCURED A'S INDEX NUMBER DISPLAYED i.e. ZERO 0
		System.out.println("INDEX OF a AND D IS "+q.indexOf('a')+" AND "+q.indexOf('D')); // CASE SENSITIVE METHOD
		
		// for last occurance of character
		
		System.out.println("INDEX OF LAST OCCURED A IS "+p.lastIndexOf('A'));
		
		// TO CHECK INDEX FROM SPECIFIC CHARACTER
		
		System.out.println("INDEX OF d FROM FIFTH INDEX IS "+q.indexOf('d', 5));
		// it checks index from fifth index and above ; not from zero
		
		// STUDY OF REPLACE METHOD OF STRING CLASS
		System.out.println("REPLACE METHOD STUDY OF STRING CLASS====================================================");
		
		String branch="TELECOMMUNICATION";
		
		System.out.println("Replaced m of telecommunication with d "+branch.replace('M', 'D'));
		
		System.out.println("Replaced Tele from duplex in telecommunication "+branch.replace("TELE", "DUPLEX"));
	}

}
