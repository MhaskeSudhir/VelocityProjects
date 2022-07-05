package logicalProgaramsClass;

import java.util.HashMap;
import java.util.Set;

public class RepetativeStringInString {

	public static void main(String[] args) {
		
		String str="abc abc abc def def ghg ghg";
		
		String[] arrstr = str.split(" ");
		HashMap<String,Integer> map=new HashMap<String, Integer>();
		for(int i=0; i<=arrstr.length-1; i++)
		{
			String str1 = arrstr[i];
			
			if(map.containsKey(str1))
			{
				map.put(str1, map.get(str1)+1);
			}
			else
			{
				map.put(str1, 1);
			}
		}
		
		Set<String> keys = map.keySet();
		
		for(String k:keys)
		{
			System.out.println(k+" "+map.get(k));
		}

	}

}
