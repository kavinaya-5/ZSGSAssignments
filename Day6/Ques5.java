class BankAccount1 { 
    private String accountNumber; 
    private String accountHolderName; 
    private double balance; 
    
    public void setAccountNumber(String accountNumber) { 
        this.accountNumber = accountNumber; 
    } 
    
    public String getAccountNumber() { 
        return accountNumber; 
    } 
    
    public void setAccountHolderName(String name) { 
        accountHolderName = name; 
    } 
    
    public String getAccountHolderName() { 
        return accountHolderName; 
    }
    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
    // Getter for balance
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) { 
        if (amount > 0) { 
            balance += amount; 
            System.out.println("Balance after deposit: " + balance); 
        } else {
            System.out.println("Invalid deposit amount.");
        }
    } 
    
    public void withdraw(double amount) { 
        if (amount < 0) { 
            System.out.println("Invalid amount"); 
        } else if (amount <= balance) { 
            balance -= amount; 
            System.out.println("Balance after withdrawal: " + balance); 
        } else { 
            System.out.println("Insufficient amount"); 
            System.out.println("Available balance: " + balance); 
        } 
    } 
} 
public class Ques5 { 
    public static void main(String[] args) { 
        BankAccount1 bank = new BankAccount1(); 
        
        bank.setAccountNumber("3425674"); 
        bank.setAccountHolderName("Malai"); 
        bank.setBalance(2000);  // Setting initial balance manually
        System.out.println("Account Number: " + bank.getAccountNumber()); 
        System.out.println("Account Holder: " + bank.getAccountHolderName()); 
        System.out.println("Initial Balance: " + bank.getBalance());
        bank.deposit(1000); 
        bank.withdraw(500); 
        bank.withdraw(3000);  // Will trigger insufficient funds
    } 
}
