public class BankAccount {
    private double acc_balance;

    public BankAccount(double init_balance){
        this.acc_balance=init_balance;
    }

    public double getBalance(){
        return acc_balance;

    }

    public void deposit(double amount){
        if (amount>0) {
            acc_balance+=amount;
            
        }

    }

    public boolean withdraw(double amount){
        if (amount>0 && acc_balance >= amount) {
            acc_balance-=amount;
            return true;
            
        }
        return false;
    }
    
}
