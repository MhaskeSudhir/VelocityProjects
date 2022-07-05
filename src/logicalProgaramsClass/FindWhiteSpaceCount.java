package logicalProgaramsClass;

public class FindWhiteSpaceCount {

	public static void main(String[] args) {
		 
		String str=" A B C D E ";
		char refchar = ' ';
		int whitecount=0;
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char eachchar = str.charAt(i);
			
			//if(Character.isWhitespace(eachchar))
			if(eachchar==refchar)
			{
				whitecount++;
			}
		}
		System.out.println(whitecount);

	}

}
