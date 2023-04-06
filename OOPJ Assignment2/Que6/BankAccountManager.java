import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double accountBalance;

    public BankAccount(String name, int number) {
        accountHolderName = name;
        accountNumber = number;
        accountBalance = 0.0;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public void withdraw(double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class BankAccountManager {
    private static BankAccount[] accounts = new BankAccount[1000];
    private static int nextAccountNumber = 1000;
    
    public static int getNextAccountNumber() {
        int accountNumber = nextAccountNumber;
        nextAccountNumber++;
        return accountNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an option:");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money into an account");
            System.out.println("3. Withdraw money from an account");
            System.out.println("4. Display the account balance");
            System.out.println("5. Display the account holder's information");
            System.out.println("6. Exit");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the account holder's name:");
                    String name = sc.next();
                    int accountNumber = getNextAccountNumber();
                    BankAccount account = new BankAccount(name, accountNumber);
                    accounts[accountNumber - 1000] = account;
                    System.out.println("Account created successfully. Account number is " + accountNumber);
                    break;
                case 2:
                    System.out.println("Enter the account number:");
                    accountNumber = sc.nextInt() - 1000;
                    account = accounts[accountNumber];
                    if (account != null) {
                        System.out.println("Enter the amount to deposit:");
                        double amount = sc.nextDouble();
                        account.deposit(amount);
                        System.out.println("Deposit successful");
                    } else {
                        System.out.println("Invalid account number");
                    }
                    break;
                case 3:
                    System.out.println("Enter the account number:");
                    accountNumber = sc.nextInt() - 1000;
                    account = accounts[accountNumber];
                    if (account != null) {
                        System.out.println("Enter the amount to withdraw:");
                        double amount = sc.nextDouble();
                        account.withdraw(amount);
                        System.out.println("Withdrawal successful");
                    } else {
                        System.out.println("Invalid account number");
                    }
                    break;
                case 4:
                    System.out.println("Enter the account number:");
                    accountNumber = sc.nextInt() - 1000;
                    account = accounts[accountNumber];
                    if (account != null) {
                        System.out.println("Account balance is " + account.getAccountBalance());
                    } else {
                        System.out.println("Invalid account number");
                    }
                    break;
                case 5:
                    System.out.println("Enter the account number:");
                    accountNumber = sc.nextInt() - 1000;
                    sc.close();
                    account = accounts[accountNumber];
                    if (account != null) {
                        System.out.println("Account holder's name is " + account.getAccountHolderName());
                        System.out.println("Account balance is " + account.getAccountBalance());
                    } else {
                        System.out.println("Invalid account number");
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}               


// javac BankAccountManager.java

// java BankAccountManager      
// Enter an option:
// 1. Create a new account
// 2. Deposit money into an account
// 3. Withdraw money from an account
// 4. Display the account balance
// 5. Display the account holder's information
// 6. Exit
// 1
// Enter the account holder's name:
// Abhijeet Jawale
// Account created successfully. Account number is 1000
// Enter an option:
// 1. Create a new account
// 2. Deposit money into an account
// 3. Withdraw money from an account
// 4. Display the account balance
// 5. Display the account holder's information
// 6. Exit
