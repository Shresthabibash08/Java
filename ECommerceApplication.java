package Polymorphism;

abstract class PaymentMethods{
    public abstract void validatePayment();
    public abstract void processPayment(double amount);
}

class CreditCard extends PaymentMethods{

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;

    public CreditCard(String cardNumber,String cardHolderName, String expiryDate){
        this.cardNumber=cardNumber;
        this.cardHolderName=cardHolderName;
        this.expiryDate=expiryDate;
    }
    @Override
    public void validatePayment() {
        if(cardNumber.length()==16){
            System.out.println("Validation is completed for credit card.");
        }
    }

    // PayPal payment
class PayPalPayment extends PaymentMethods {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void validatePayment() {
        System.out.println("Validating PayPal account...");
        if(email.contains("@") && password.length() >= 6){
            System.out.println("Validation is completed for paypal");
        }
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of Rs. " + amount);
    }
}

// Bank Transfer payment
class BankTransferPayment extends PaymentMethods {
    private String accountNumber;
    private String bankName;

    public BankTransferPayment(String accountNumber, String bankName) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    public void validatePayment() {
        System.out.println("Validating bank account...");
        if(accountNumber.length() == 10){
            System.out.println("Validation for bank transfer is completed.");
        }
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer of Rs. " + amount + " to " + bankName);
    }
}

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of Rs. " + amount);
    }

}

public class ECommerceApplication {
    public static void main(String[]args){
        CreditCard creditCard=new CreditCard("1234567890098765","Bibash Shrestha","2090-1-1");
        creditCard.validatePayment();
        creditCard.processPayment(10000);
    }
}
