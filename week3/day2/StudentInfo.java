package week3.day2;

public class StudentInfo {

	/*
	 * public void findStudent(String firstName) {
	 * 
	 * System.out.println("student details of: " + firstName);
	 * 
	 * 
	 * }
	 * 
	 * 
	 * public void findStudent(String firstName, String lastName) {
	 * 
	 * System.out.println("student details of: " + firstName + " " + lastName);
	 * 
	 * }
	 * 
	 * public void findStudent(int StudId) {
	 * 
	 * System.out.println("student details of: " + StudId);
	 * 
	 * }
	 * 
	 * public void findStudent(int studId, String lastName) {
	 * 
	 * System.out.println("student details of: " + studId + " " + lastName);
	 * 
	 * }
	 * 
	 * public void findStudent(String firstName, int phno) {
	 * 
	 * System.out.println("student details of: " + phno + " " + firstName);
	 * 
	 * 
	 * }
	 * 
	 */
	
	public static void main(String args) {
		System.out.println("main method with String");
	}
	
  public static void main(int args) {
		System.out.println("main method with int");
	}
	

	public static void main(String[] args) {
		
		StudentInfo si = new StudentInfo();
		
		si.main(10);
		si.main("Hari");
		
		System.out.println("main method with String[]");
		/*
		 * StudentInfo si = new StudentInfo();
		 * 
		 * si.findStudent("Hari");
		 * 
		 * si.findStudent(100);
		 * 
		 * si.findStudent("Hari","Prasad");
		 */
		//si.findStudent(100,"Prasad");
		
		/*
		 * int[] values = {10,20}; System.out.println(values[2]);
		 */
		
		
		

	}

}
