package q3;

public class BankAccount {
	int accountNumber;
	String name;
	float balance;
	
	public BankAccount(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public float getBalance() {
		return this.balance;
	}
	
	public void deposit(float amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println("Successfully deposited " + amount + " into the account number " + accountNumber + ".");	
		} else {
			System.out.println("Unable to deposit " + amount + " into the account number " + accountNumber + ".");				
		}
	}
	
	public void withdraw(float amount) {
		if(this.balance >= amount) {
			this.balance -= amount;
			System.out.println("Successfully withdrew " + amount + " from the account number " + accountNumber + ".");	
		} else {
			System.out.println("Unable to withdraw " + amount + " from the account number " + accountNumber + ".");							
		}
	}
	
	public void transfer(BankAccount account, float amount) {
		if(amount > 0 && this.balance >= amount) {
			this.withdraw(amount);
			account.deposit(amount);
			System.out.println("Successfully transfer money between accounts.");
		} else {
			System.out.println("Unable to transfer " + amount + " from the account number " + accountNumber + " to the account number " + account.accountNumber);
		}
	}

	@Override
	public String toString() {
		return "BankAccount{" +
				"accountNumber=" + accountNumber +
				", name='" + name + '\'' +
				", balance=" + balance +
				'}';
	}
}
