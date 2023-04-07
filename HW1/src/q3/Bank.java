package q3;

import java.util.List;

public class Bank {
	public static void main(String[] args) {
		AccountManager manager = new AccountManager();
		manager.create(1, "Account 1");
		manager.create(2, "Account 2");
		manager.create(3, "Account 3");
		manager.create(4, "Account 4");
		manager.create(5, "Account 5");
		System.out.println(manager);
		System.out.println();

		// Get all bank accounts
		List<BankAccount> accounts = manager.bankAccounts;
		BankAccount acc1 = accounts.get(0);
		BankAccount acc2 = accounts.get(1);
		BankAccount acc3 = accounts.get(2);
		BankAccount acc4 = accounts.get(3);
		BankAccount acc5 = accounts.get(4);

		// Deposit 1000 into account number 1
		manager.deposit(1, 1000);
		System.out.println("The balance of account number 1 is " + acc1.getBalance());
		System.out.println();

		// Withdraw 200 from account number 2
		manager.withdraw(2, 200);
		System.out.println("The balance of account number 2 is " + acc2.getBalance());
		System.out.println();

		// Withdraw 200 from account number 1
		manager.withdraw(1, 200);
		System.out.println("The balance of account number 1 is " + acc1.getBalance());
		System.out.println();

		// Transfer 500 from account number 1 to account number 2
		acc1.transfer(acc2, 500);
		System.out.println("The balance of account number 1 is " + acc1.getBalance());
		System.out.println("The balance of account number 2 is " + acc2.getBalance());
		System.out.println();

		// Deposit 1000 into account number 4 and 5
		manager.deposit(4, 1000);
		System.out.println("The balance of account number 4 is " + acc4.getBalance());
		manager.deposit(5, 1000);
		System.out.println("The balance of account number 5 is " + acc5.getBalance());
		System.out.println();

		// Transfer 500 from account number 5 to account number 3
		acc5.transfer(acc3, 500);
		System.out.println("The balance of account number 3 is " + acc3.getBalance());
		System.out.println("The balance of account number 5 is " + acc5.getBalance());
		System.out.println();

		// Transfer 1000 from account number 5 to account number 4
		acc5.transfer(acc4, 1000);
		System.out.println("The balance of account number 4 is " + acc4.getBalance());
		System.out.println("The balance of account number 5 is " + acc5.getBalance());
		System.out.println();

		// Delete account number 3
		manager.delete(3);
		System.out.println(manager);
		System.out.println();
	}
}
