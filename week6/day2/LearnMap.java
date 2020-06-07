package week6.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		
	Map<Integer,String>	 empInfo = new LinkedHashMap<Integer,String>();
	
	empInfo.put(100, "Hari");
	empInfo.put(200, "Babu");
	empInfo.put(500, "Naveen");
	empInfo.put(300, "Sam");
	empInfo.put(400, "Dhivya");
	
	
	
	// Set<Integer> keySet = empInfo.keySet();
	
		/*
		 * for (Integer eachKey : keySet) {
		 * 
		 * //if(empInfo.get(eachKey).equals("Naveen"))
		 * System.out.println(eachKey+" --> "+empInfo.get(eachKey));
		 * //System.out.print(empInfo.get(eachKey));
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
	
	/*
	System.out.println(empInfo.get(300));
	
	
	Set<Entry<Integer, String>> empSet = empInfo.entrySet();
	
	for(Entry<Integer, String> eachEntry : empSet) {
		
		System.out.println(eachEntry.getKey()+" -->  "+eachEntry.getValue());
		
		
	}*/
	
	
//	empInfo.remove(300);
	
	// Map<Integer,String>	 values = new HashMap<Integer,String>(empInfo);
	
	//values.putAll(empInfo);
	

	}

}
