//1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter and setter methods to access and modify these details securely. Also include a method to display the transaction summary.]
class PaymentGatewaySystem {
    private int transactionId;
    private String payerName;
    private String payeeName;
    private double amount;
    private String paymentMethod;
    private String transactionStatus;

    // Setters
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    // Getters
    public int getTransactionId() {
        return transactionId;
    }

    public String getPayerName() {
        return payerName;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    // Method to display summary
    public void displayTransactionSummary() {
        System.out.println("Transaction Summary:");
        System.out.println("ID: " + transactionId);
        System.out.println("Payer: " + payerName);
        System.out.println("Payee: " + payeeName);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Status: " + transactionStatus);
    }
}

public class Ques1 {
    public static void main(String[] args) {
        PaymentGatewaySystem payment = new PaymentGatewaySystem();
        payment.setTransactionId(234);
        payment.setPayerName("Kavinaya");
        payment.setPayeeName("Naga");
        payment.setAmount(5000.00);
        payment.setPaymentMethod("UPI");
        payment.setTransactionStatus("Successful");

        // Display transaction details
        payment.displayTransactionSummary();
    }
}
