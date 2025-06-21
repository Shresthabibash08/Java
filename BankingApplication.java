package Polymorphism;


abstract class Account{
   protected double balance;
   public Account(double balance){
    this.balance=balance;
   }
   public abstract double calculateInterest();
}
    
class FixedDepositAccounts extends Account{
    private double time;
    private double rate;
    public FixedDepositAccounts(double balance,double time,double rate){
        super(balance);
        this.time=time;
        this.rate=rate;
    }

    @Override
    public double calculateInterest() {
        return (balance*time*rate)/100;
    }
}

class SavingAccounts extends Account{
    private double rate;
    public SavingAccounts(double balance,double rate) {
        super(balance);
        this.rate=rate;
    }

    @Override
    public double calculateInterest() {
        return balance*rate;
    }

}
public class BankingApplication {
    public static void  main(String[]args){
       FixedDepositAccounts fixed=new FixedDepositAccounts(10000, 2, 5);
       System.out.println(fixed.calculateInterest());

    }
}
