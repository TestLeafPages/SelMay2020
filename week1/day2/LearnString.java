package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		
		/*
		 * String s1 = "Welcome" ;
		 * 
		 * System.out.println(s1.hashCode());
		 * 
		 * s1 = s1+10;
		 * 
		 * System.out.println(s1.hashCode());
		 */
		
		//StringBuilder
		
		StringBuffer str = new StringBuffer("Welcome");
		
		System.out.println(str.hashCode());
		
		str.append("home");
		System.out.println(str);
		
		System.out.println(str.hashCode());
	
		
		
		
	//	System.out.println(Character.isDigit('9'));
		
		/*
		 * for (int i = 0; i < s1.length(); i++) {
		 * 
		 * System.out.print(s1.charAt(i)+" ");
		 * 
		 * 
		 * }
		 */
		
		
		/*
		 * char[] charArray = s1.toCharArray();
		 * 
		 * for (char eachChar : charArray) {
		 * 
		 * System.out.print(eachChar+" ");
		 * 
		 * }
		 */
		
		
		
		//System.out.println(s1.replaceAll("[A-Za-z]", ""));
		
		//System.out.println(s1.replace("Wel", ""));
		
		//System.out.println(s1.trim());
		
		/*
		 * int x = 10;
		 * 
		 * System.out.println(s1+x);
		 */
		
		/*
		 * String s2 = "To" ;
		 * 
		 * String s3 = "Java Session";
		 * 
		 * System.out.println(s1.concat(" ").concat(s2).concat(" ").concat(s3));
		 */
		
	//	String s2 = "Welcome" ;
		
		//System.out.println(s1.toUpperCase());
		
	//	System.out.println(s1.toLowerCase());
		
		
		
		//int len = s1.length();
		
		//System.out.println(s1.length());
		
		//System.out.println(s1.charAt(4));
	//	System.out.println(s1.charAt(len-1));
		
	//	System.out.println(s1.equals(s2));
	//	System.out.println(s1.equalsIgnoreCase(s2));
		
		/*
		 * String s3 = new String("welcome");
		 * 
		 * System.out.println(s1.equals(s2));
		 * 
		 * System.out.println(s1.equals(s3));
		 * 
		 * System.out.println("******************");
		 * 
		 * System.out.println(s1==s2);
		 * 
		 * System.out.println(s1==s3);
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
