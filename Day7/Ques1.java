//2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main class where you can accept payment using different methods.
import java .util.Scanner;
interface PaymentMethod
{
    void pay(double amount);
}
class CreditCardPayment implements PaymentMethod
{
    String name;
    int creditCardNumber;
    CreditCardPayment(String name,int creditCardNumber)
    {
        this.creditCardNumber=creditCardNumber;
        this.name=name;
    }

    public void pay(double amount)
    {
        System.out.println("Credit card number is: "+creditCardNumber);
        System.out.println("Name of the credit card member is: "+name);
        System.out.println("Credit card payment is successful and the amount Rs :"+amount+" is deducted from your account");
    }
}
class DebitCardPayment implements PaymentMethod {
    String name;
    int cvv;

    DebitCardPayment(String name, int cvv)
    {
        this.name=name;
        this.cvv=cvv;
    }

    public void pay(double amount)
    {
        System.out.println("name of the payer is: "+name);
        System.out.println("Cvv number is: "+cvv);
        System.out.println("Debit card payment is successful and the amount Rs :"+amount+" is deducted from your account");
    }
}
class UPIPayment implements PaymentMethod{
    String name;
    String upiId;
    UPIPayment(String name,String upiId)
    {
        this.name=name;
        this.upiId=upiId;
    }
    public void pay(double amount)
    {
        System.out.println("name of the payer is: "+name);
        System.out.println("Upi id is :"+upiId);
        System.out.println("UPI payment is successful and the amount Rs :"+amount+" is deducted from your account");
    }
}
public class Ques1
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the name and the credit card number: ");
        PaymentMethod creditcard=new CreditCardPayment(in.nextLine(),in.nextInt());
        in.nextLine();
        System.out.println("Enter the credit card amount:");
        creditcard.pay(in.nextDouble());
        in.nextLine();
        System.out.println("enter the name and cvv number :");
        PaymentMethod debitcard=new DebitCardPayment(in.nextLine(),in.nextInt());
        in.nextLine();
        System.out.println("Enter the debit card amount:");
        debitcard.pay(in.nextDouble());
        in.nextLine();
        System.out.println("enter the name and the upi id: ");
        PaymentMethod upipayment=new UPIPayment(in.nextLine(),in.next());
        in.nextLine();
        System.out.println("Enter the upi amount amount:");
        upipayment.pay(in.nextDouble());
    }
}
