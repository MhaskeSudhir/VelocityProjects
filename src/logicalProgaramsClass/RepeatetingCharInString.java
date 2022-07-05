package logicalProgaramsClass;

import java.util.HashMap;
import java.util.Set;

public class RepeatetingCharInString {

	public static void main(String[] args) {
		
		
		String str="abcabcabcggHHTT";
		
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0; i<=str.length()-1; i++)
		{
			
			char charString = str.charAt(i);
			
			if(map.containsKey(charString))
			{
				map.put(charString, map.get(charString)+1);
			}
			else {
				map.put(charString, 1);
			}
		}
		System.out.println(map);
		
		Set<Character> keys = map.keySet();
		
		for(Character k:keys)
		{
			System.out.println(k+" "+map.get(k));
		}

	}

}
