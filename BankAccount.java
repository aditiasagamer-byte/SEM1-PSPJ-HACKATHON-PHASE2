import java.util.Scanner;

class BankAccount {
    String accountNumber, accountHolderName;
    double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(sc.nextLine(), sc.nextLine(), sc.nextDouble());
        acc.deposit(sc.nextDouble());
        acc.withdraw(sc.nextDouble());
        acc.displayAccount();
        sc.close();
    }
}