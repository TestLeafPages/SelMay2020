package week3.sunday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> values = new LinkedList<String>();
		
				
		values.add("Hari");
		values.add("Balaji");
		values.add("Hari");
		values.add("Sam");
		values.add("Babu");
		values.add("Naveen");
		
		
		
		/*
		 * List<String> newValues = new ArrayList<String>();
		 * 
		 * // All the 6 values added newValues.addAll(values);
		 * 
		 * // values will be having 5 values - prasad removed from 1st list
		 * values.remove(2);
		 * 
		 * //6 - 5 = will be having one value newValues.removeAll(values);
		 * //newValues.retainAll(values);
		 * 
		 * System.out.println(values.size());
		 */
		
		for(String eachValue : values) {
			
			System.out.println(eachValue);
			
		}
		
		
		Collections.sort(values);
		
		System.out.println("#######################");
		
	for(String eachValue : values) {
			
			System.out.println(eachValue);
			
		}
		
		
		
		
		/*
		 * for (int i = 0; i < values.size(); i++) { System.out.println(values.get(i));
		 * }
		 */
		
		
		//<> - generic
		

	//}

	for(String eachValue : values) {
			
			System.out.println(eachValue);
			
		}
	}
}
