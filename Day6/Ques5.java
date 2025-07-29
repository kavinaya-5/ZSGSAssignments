class BankAccount1{
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public void setAccountHolderName(String name)
    {
        accountHolderName=name;
    }
    public String getAccountHolderName()
    {
        return accountHolderName;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance=balance+amount;
            System.out.println("balance amount is:"+balance);
        }
    }
    public void withdraw(double amount)
    {
        if(amount<0)
        {
            System.out.println("Invalid amount");
        }
        else if(amount<=balance)
        {
            balance=balance-amount;
            System.out.println("balance amount is:"+balance);
        }
        else {
            System.out.println("Insufficient amount");
            System.out.println("you are available only with : "+balance);
        }
    }
}
public class Ques5 {
    public static void main(String[] args) {
        BankAccount1 bank=new BankAccount1();
        bank.setAccountNumber("3425674");
        bank.setAccountHolderName("Malai");
        System.out.println("Account number is:"+bank.getAccountNumber());
        System.out.println("Account Holder name is: "+bank.getAccountHolderName());
        bank.deposit(1000);
        bank.withdraw(500);
        bank.withdraw(1000);

    }
}
//5. Design a class named `BankAccount` that uses the concept of encapsulation. The class should have the following private data members: account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields. Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative.