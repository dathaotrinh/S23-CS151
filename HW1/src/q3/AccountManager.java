package q3;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	List<BankAccount> bankAccounts;
	
	public AccountManager() {
		bankAccounts = new ArrayList<>();
	}

	// Check if the account number exists
	private BankAccount find(int accountNumber) {
		BankAccount lookupAccount = null;
		for(BankAccount account: bankAccounts) {
			if(accountNumber == account.accountNumber) {
				lookupAccount = account;
				break;
			}
		}
		return lookupAccount;
	}
	
	public void create(int accountNumber, String name) {
		BankAccount lookupAccount = find(accountNumber);

		if(lookupAccount != null) {
			System.out.println("This account number already exists in the system.");
		} else {
			BankAccount newAcc = new BankAccount(accountNumber, name);
			bankAccounts.add(newAcc);
			
			System.out.println("Successfully created account number " + accountNumber + " for " + name + ".");	
		}
	}
	
	public void delete(int accountNumber) {
		BankAccount deletedAccount = find(accountNumber);
		
		if(deletedAccount == null) {
			System.out.println("Cannot find account number " + accountNumber + " in the system.");
		} else {
			bankAccounts.remove(deletedAccount);
			System.out.println("Successfully delete account number " + accountNumber + ".");
		}
	}
	
	
	public void deposit(int accountNumber, float amount) {
		BankAccount lookupAccount = find(accountNumber);

		if(lookupAccount == null) {
			System.out.println("This account number does not exists in the system.");
		} else {
			lookupAccount.deposit(amount);
		}		
	}
	
	public void withdraw(int accountNumber, float amount) {
		BankAccount lookupAccount = find(accountNumber);

		if(lookupAccount == null) {
			System.out.println("This account number does not exists in the system.");
		} else {
			lookupAccount.withdraw(amount);
		}		
	}

	@Override
	public String toString() {
		return "AccountManager{" +
				"bankAccounts=" + bankAccounts +
				'}';
	}
}
