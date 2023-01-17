import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName;
        int accNo;
        double balance;
        Bank ba;
        int choice;
        double amt;

        Scanner in = new Scanner(System.in);
        System.out.println("Creating New Account");
        System.out.println("-----------------------");
        System.out.print("Enter Your Name: ");
        userName = in.nextLine();
        System.out.print("Enter Account Number: ");
        accNo = in.nextInt();
        System.out.print("Enter Account balance: ");
        balance = in.nextDouble();

        if(balance < 500){
            System.out.println("Account can't be created. Minimum of $500 required!!");
            System.exit(0);
        }
        ba = new Bank(userName, accNo, balance);
        do {
            System.out.println("\n");
            System.out.println("    Transactions");
            System.out.println("------------------------------");
            System.out.println("1.  Deposit");
            System.out.println("2.  Withdraw");
            System.out.println("3.  Display Account Details");
            System.out.println("4.  Exit Program");
            System.out.println("------------------------------");
            System.out.print("Enter your choice here ->: ");
            choice = in.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to deposit: ");
                    amt = in.nextDouble();
                    balance = ba.deposit(amt);
                    System.out.println("Your current balance: $" + balance);
                }
                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    amt = in.nextDouble();
                    balance = ba.withdraw(amt);
                    System.out.println("Your current balance: $" + balance);
                }
                case 3 -> ba.displayDetails();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Please Enter a number between 1 - 4");
            }
        }while (choice != 4);
    }
}