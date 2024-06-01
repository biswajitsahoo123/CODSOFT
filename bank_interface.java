import java.util.Scanner;
// Define an interface for ATM operations
interface bankuser {
    void withdraw(int amount);
    void deposit(int amount);
    float checkBalance();
}

// Define a class for basic ATM operations
class atm implements bankuser{
    private int balance;

    public atm(int balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Deposit failed. Invalid amount.");
        }
    }
    @Override
    public float checkBalance() {
        return balance;
    }
}

public class bank_interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        int initialBalance = sc.nextInt();

        bankuser a = new atm(initialBalance);
        System.out.println("1 for with drawl , 2 for deposit ,3 for check balance & 4 for exit :");
        int option;
        do {
            System.out.println("enter your choice :");
             option= sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("enter your withdraw amount :");
                    int withdraw= sc.nextInt();
                    a.withdraw(withdraw);
                    break;
                case 2:
                    System.out.println("enter your deposit amount :");
                    int deposit= sc.nextInt();
                    a.deposit(deposit);
                    break;
                case 3:
                    System.out.println("your current balance is :"+a.checkBalance());
                    break;
                case 4:
                    System.out.println("thank you! :");
                    break;
                default:
                    System.out.println("invalid option :");
            }
        }while (option !=4);{
            sc.close();
        }
    }
}