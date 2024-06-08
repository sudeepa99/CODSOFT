import java.util.Scanner;

public class ATM {
    Scanner scanner = new Scanner(System.in);

    private BankAccount account;

    public ATM(BankAccount account){
        this.account=account;

    }


    public void display(){
        
        while (true) {
            System.out.println("Welcome ! ");
            System.out.println("Choose your option from the menu:");
            System.out.println("!. Check Balance");
            System.out.println("2 .Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.printf("Enter the related number for your option:");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                CheckBalance();
                break;

                case 2:
                DepositMoney();

                case 3:
                WithdrawMoney();
                break;

                case 4:
                System.out.println("Thank you for choosing ATM services, come back again!");
                break;

                default:
                System.out.println("Incorrect input");
                    
            }


            
        }

        

        

        
    }

    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount(500.0);
    
        double with_money;

        //taking user from the deposit money
        
        

        
        
        
        
    }


    public void WithdrawMoney(){
        System.out.println("Enter the withdrwa amount");

        double amount= scanner.nextDouble();

        if (amount <=0) {
            System.out.println("Amount should be more than 0");
            
        }
        else if (account.withdraw(amount)) {
            System.out.println("Successfully withdrawed, Your new balance is: " + account.getBalance());
            
        }
        else{
            System.out.println("Insufficient funds, Your current balance is: " + account.getBalance());
        }

    }

    private void DepositMoney(){
        System.out.println("Enter amount to deposit");
        double amount = scanner.nextDouble();

        if (amount<=0) {
            System.out.println("Invalid amount, Please enter a valid amount");
            
        }
        account.deposit(amount);

        System.out.println("Deposit successfull, Your new balance is :"+ account.getBalance());

        


        
    }

    private void CheckBalance(){
        System.out.println("Your account balance is :"+account.getBalance());
        

    }
}


