package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
	//	int[] num = new int[4];
		
		int[] num = {10,20,30,40};

		/*
		 * num[0] = 50; num[1] = 20; num[2] = 60; num[3] = 40;
		 */
		
		
		for (int i : num) {
			System.out.println(i);
		}
		
		/*
		 * for( int temp : num) {
		 * 
		 * System.out.println(temp); }
		 */
		
		
		/*
		 * Arrays.sort(num);
		 * 
		 * for (int i = 0; i <num.length; i++) { System.out.println(num[i]); }
		 */

		/*
		 * for (int i = 0; i < num.length; i++) {
		 * 
		 * if(num[i]==20) { System.out.println(i); } }
		 */

		/*
		 * System.out.println(num[num.length-1]);
		 * 
		 * System.out.println(num[0]);
		 */

		/*
		 * System.out.println(num.length);
		 * 
		 * System.out.println(num[num.length-1]);
		 */

	}

}
