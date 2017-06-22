package session8;

public class OnlineBankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating instance object for Account class
		Account account1 = new Account(3000);

		// creating threads using depositThread which implements Runnable
		// interface by starting execution

		new Thread(new depositThread(account1, 3000)).start();

		new Thread(new depositThread(account1, 2000)).start();

		new Thread(new depositThread(account1, 5000)).start();

		// creating threads using withdrawThread which implements Runnable
		// interface by starting execution

		new Thread(new withdrawThread(account1, 3000)).start();

		new Thread(new withdrawThread(account1, 2000)).start();

		new Thread(new withdrawThread(account1, 5000)).start();

	}

}
