package exercises.exercises5;

public class BankAccount {
    
    private String accountNumber;
    private double balance;
    
    
    public BankAccount(String accNum, double initialBalance) {
        setAccountNumber(accNum);
        setBalance(initialBalance);
    }
    
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setAccountNumber(String newNumber) {
        if (newNumber == null || newNumber.trim().isEmpty()) {
            accountNumber = "INVALID_ACC";
        } else {
            accountNumber = newNumber;
        }
    }
    
    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        }
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
    
    public void transfer(BankAccount otherAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance = this.balance - amount;
            otherAccount.balance = otherAccount.balance + amount;
        }
    }
   
    public void showInfo() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}