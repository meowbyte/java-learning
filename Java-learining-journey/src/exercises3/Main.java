package exercises.exercises3;

public class Main {
	public static void main(String[] args) {
		
		 BankAccount account = new BankAccount("ACC123", 1000);
	   
		 account.deposit(500);
	   
	     account.withdraw(200);
	        
	     account.displayBalance();
	    }
		
	}

