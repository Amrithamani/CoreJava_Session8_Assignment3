package session8;

public class Account {

	// initializing private balance variable

	private double balance;

	// creating parameterized constructor

	Account(double balance) {

		this.balance = balance;// assigning value in instance variable

	}

	// declaring synchronized withdraw method

	synchronized void deposit(double amt) {

		balance += amt;// adding amount in balance

		System.out
		.println("Deposit " + amt + " in thread " + Thread.currentThread().getId() + ", balance is " + balance);
		// prints Deposit amt in thread id, balance is balance amount

	}

	// declaring synchronized deposit method

	synchronized void withdraw(double amount) {
		// TODO Auto-generated method stub

		// checking amount and balance by certain condition

		if (balance < 1000 || amount > balance) {

			// throw Custom Defined Exception

			try {

				throw new BankATMException("Withdrawal is not allowed " + amount + " in thread "
						+ Thread.currentThread().getId() + ", balance is " + balance);
				// prints Withdrawal is not allowed amount in thread id, balance
				// is balance amount

			} catch (BankATMException e) {

				System.out.println(e);
				// prints Withdrawal is not allowed
			}

		} else {

			balance -= amount;
			// withdrawal from balance
		}

		System.out.println("Withdraw is allowed" + amount + " in thread " + Thread.currentThread().getId()
				+ ", balance is " + balance);
		// prints Withdrawal is allowed amount in thread id, balance is balance
		// amount

	}
}
