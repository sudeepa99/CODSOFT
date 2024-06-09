import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner scanner;
    private boolean running;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
        this.running = true;
    }

    public void display() {
        while (running) {
            System.out.println("Welcome!");
            System.out.println("Choose your option from the menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.printf("Enter the related number for your option: ");

            // Taking user input for option
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    System.out.println("Thank you for choosing ATM services, come back again!");
                    running = false;
                    break;

                default:
                    System.out.println("Incorrect input, please try again.");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        ATM atm = new ATM(account);

        atm.display();
    }

    public void withdrawMoney() {
        System.out.println("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount should be more than 0.");
        } else if (account.withdraw(amount)) {
            System.out.println("Successfully withdrawn. Your new balance is: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds. Your current balance is: " + account.getBalance());
        }
    }

    private void depositMoney() {
        System.out.println("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a valid amount.");
        } else {
            account.deposit(amount);
            System.out.println("Deposit successful. Your new balance is: " + account.getBalance());
        }
    }

    private void checkBalance() {
        System.out.println("Your account balance is: " + account.getBalance());
    }
}
