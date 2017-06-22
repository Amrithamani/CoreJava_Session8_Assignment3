package session8;

public class depositThread implements Runnable {

	// initializing account object variable using Account class

	private Account account;

	// initializing private amount variable

	double amount;

	// declaring parameterized constructor

	depositThread(Account account, double amount) {

		// assigning values in instance variable

		this.amount = amount;

		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		account.deposit(amount);// calling deposit method in Account class
		// using account object

	}

}
