import java.util.Scanner;

public class ATM {

    public void display(){
        Scanner scanner = new Scanner(System.in);

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
        


    

    }

    public void DepositMoney(){

        


        
    }

    public void CheckBalance(){
        

    }
}


