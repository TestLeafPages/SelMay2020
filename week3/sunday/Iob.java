package week3.sunday;

public class Iob implements Cibil {

	public void freeCreditCard() {
		System.out.println("credit card");

	}
	
	
	public static void main(String[] args) {
		
		//Iob iob = new Iob();
		
		Iob iob = new Iob();
		
		iob.maxLoanValue();
		iob.minimumBalance(2000);
		iob.getCreditScore();
		iob.freeCreditCard();
		
		
		
		/*
		 * iob.maxLoanValue(); iob.minimumBalance(5000);
		 * 
		 * iob.getCreditScore();
		 * 
		 * iob.freeCreditCard();
		 */
		
		
	}


	public void maxLoanValue() {

		System.out.println("1000000");

	}

	public void minimumBalance(int value) {

		System.out.println(value);

	}

	public void getCreditScore() {
		System.out.println(750);
		
	}


	public void lockdownCredit() {
		// TODO Auto-generated method stub
		
	}


	
	
	
	

}
