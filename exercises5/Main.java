package exercises.exercises5;

public class Main {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("ACC001", 1000);
        BankAccount account2 = new BankAccount("ACC002", 500);
        
        System.out.println("--- Initial ---");
        account1.showInfo();
        account2.showInfo();
        
       
        System.out.println("\n--- Testing Operations ---");
        account1.deposit(200);
        account1.withdraw(100);
        account1.transfer(account2, 300);
        
        System.out.println("\n--- After Operations ---");
        account1.showInfo();
        account2.showInfo();
        
        
        System.out.println("\n--- Testing Invalid Inputs ---");
        account1.setBalance(-500);      
        account1.setAccountNumber(""); 
        account1.transfer(account2, 10000); 
        
        System.out.println("\n--- Final ---");
        account1.showInfo();
        account2.showInfo();
    }
}