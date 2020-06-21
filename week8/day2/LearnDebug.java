package week8.day2;

public class LearnDebug {

	public int fact(int a) {
		int f = 1;
		for (int i = 1; i <= a; i++) {

			f = i * f;

		}

		return f;

	}

	public static void main(String[] args) {
		LearnDebug ld = new LearnDebug();

		int fact = ld.fact(5);

		System.out.println(fact);

		
		  int pct = 0;
		  
		  pct = fact / 100 * 100;
		  
		  System.out.println(pct);
		 

	}

}
