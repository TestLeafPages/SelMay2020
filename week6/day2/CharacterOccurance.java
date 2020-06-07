package week6.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharacterOccurance {

	public static void main(String[] args) {
		String name = "Hariprasad" ;
		
		char[] charArray = name.toCharArray();
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for (char eachChar : charArray) {
			
			if(map.containsKey(eachChar)) {
				
				map.put(eachChar, map.get(eachChar)+1 );
				
			}
			else {
			
				map.put(eachChar, 1);
				
			}
			
		}
		
		
		Set<Entry<Character, Integer>> setValues = map.entrySet();
		
		for(Entry<Character, Integer> eachEntry : setValues) {
			
			System.out.println(eachEntry.getKey()+" -->  "+eachEntry.getValue());
			
			
		}
		

	}

}
