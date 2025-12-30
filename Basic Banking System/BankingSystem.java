import java.util.Scanner;

class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance)
            throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

public class BankingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);

        while (true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Exit");
            int choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Amount: ");
                    account.deposit(sc.nextDouble());
                }
                else if (choice == 2) {
                    System.out.print("Amount: ");
                    account.withdraw(sc.nextDouble());
                }
                else if (choice == 3) {
                    System.out.println("Balance: " + account.getBalance());
                }
                else break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}
