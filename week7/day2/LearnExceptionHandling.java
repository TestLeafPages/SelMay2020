package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnExceptionHandling {
	
	
	public void simpleCalc() throws FileNotFoundException  {
		FileInputStream fis = new FileInputStream("./test.xlsx");

	}
	

	public static void main(String[] args) throws FileNotFoundException {
		
		LearnExceptionHandling leh = new LearnExceptionHandling();
				
		try {
			leh.simpleCalc();
		} catch (Exception e) {
			System.out.println(e);
		}
				
				
		// FileInputStream fis = new FileInputStream("./test.xlsx");

		/*
		 * int x = 10;
		 * 
		 * int y;
		 */
		
		//int[] num = new int[2];

		// System.out.println(x/0);

		/*
		 * try { System.out.println(x / 2); try { System.out.println(num[2]); } catch
		 * (ArrayIndexOutOfBoundsException e) { e.printStackTrace(); } } catch
		 * (ArithmeticException e) {
		 * System.out.println("failed because of division by zero"); }
		 * 
		 * catch (Exception e) { System.out.println(e); } finally {
		 * System.out.println("finally block"); }
		 */
		System.out.println("after exception");

	}

}
