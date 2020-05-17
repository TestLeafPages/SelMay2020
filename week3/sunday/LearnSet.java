package week3.sunday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<String> values = new TreeSet<String>();
		
		System.out.println(values.add("Hari"));
		values.add("Balaji");
		System.out.println(values.add("Hari"));
		values.add("Sam");
		values.add("Babu");
		values.add("Naveen");
		
		List<String> listValues = new ArrayList<String>();
		listValues.addAll(values);
		
		System.out.println(listValues.get(3));
		
		
			
		
	for (String eachValue : values) {
		
		System.out.println(eachValue);
	}
		
	}
		
		
}
