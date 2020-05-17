package week3.sunday;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		String input = "PayPal India";
		
//		Declare a String as PayPal India

//		Convert it into a character array
		
		char[] charArray = input.toCharArray();

//		Declare a Set as charSet for Character
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		

//		Declare a Set as dupCharSet for duplicate Character
		
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

//		Iterate character array and add it into charSet
		
		for (Character eachChar : charArray) {
			
			if(!charSet.add(eachChar)) {
				dupCharSet.add(eachChar);
			}
			
		}
		
		/*
		 * for (Character character : charSet) {
		 * 
		 * System.out.println(character);
		 * 
		 * }
		 */
		
		
		  charSet.removeAll(dupCharSet);
		  
		  for (Character temp : charSet) {
		  
		  if(temp!=' ') {
			  
			  System.out.print(temp);
			  }
		  
		  }
		 

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print each character for charSet

	}
}
