package week3.day2;

public class SbiMadurai extends SbiHo {

	@Override
	public void savingAccount()

	{
		System.out.println("interest - 10%");

	}

	public static void main(String[] args) {

		SbiMadurai sm = new SbiMadurai();

		sm.savingAccount();

	}

}
