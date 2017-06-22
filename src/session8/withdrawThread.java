package session8;

public class withdrawThread implements Runnable {

	// initializing account object variable using Account class

	private Account account;

	// initializing private amount variable

	private double amount;

	// declaring parameterized constructor

	withdrawThread(Account account, double amount) {

		// assigning values in instance variable

		this.amount = amount;

		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		account.withdraw(amount);// calling withdraw method in Account class
		// using account object

	}

}
