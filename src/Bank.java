public class Bank {
    String name;
    int accountNumber;
    double balance;
    
    public Bank(String userName, int accNo, double accBalance){
        name = userName;
        accountNumber = accNo;
        balance = accBalance;
    }
    public double deposit(double amt){
        if(amt < 0){
            System.out.println("Please enter a positive amount");
        }else {
            balance += amt;
        }
        return balance;
    }
    public double withdraw(double amt){
        if(amt < 0){
            System.out.println("Please enter a positive amount to withdraw");
        }else if(balance - amt < 500){
            System.out.println("You don't have enough funds to withdraw and have a minimum balance of $500");
        }else{
            balance -= amt;
        }
        return balance;
    }
    public void displayDetails(){
        System.out.println("Customer Name\t" + "Account Balance");
        System.out.println("------------------------------");
        System.out.println(name+"\t\t\t\t\t" + balance);
    }
    
}
