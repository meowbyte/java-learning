package exercises.exercises3;

public class BankAccount {
	    String accountNumber;
	    double balance;
	    
	    public BankAccount(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }
	    
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance = balance + amount;
	        }
	    }
	    
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance = balance - amount;
	        }
	    }
	    
	    public void displayBalance() {
	        System.out.println("Balance: $" + balance);
	    }
	    
	    public double getBalance() {
	        return balance;
	    }
	}
