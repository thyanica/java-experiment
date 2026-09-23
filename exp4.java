class Account {
    String name;
    int accountNumber;

    Account(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    void displayAccount() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
}

class SavingsAccount extends Account {
    double balance;

    SavingsAccount(String name, int accountNumber, double balance) {
        super(name, accountNumber);
        this.balance = balance;
    }

    void displaySavings() {
        displayAccount();
        System.out.println("Savings Balance: " + balance);
    }
}

class CurrentAccount extends Account {
    double balance;

    CurrentAccount(String name, int accountNumber, double balance) {
        super(name, accountNumber);
        this.balance = balance;
    }

    void displayCurrent() {
        displayAccount();
        System.out.println("Current Balance: " + balance);
    }
}

class PremiumSavingsAccount extends SavingsAccount {

    PremiumSavingsAccount(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    void displayPremium() {
        displaySavings();
        System.out.println("Account Type: Premium Savings Account");
    }
}

class exp4 {
    public static void main(String[] args) {

        SavingsAccount savings =
            new SavingsAccount("Shraeyaa", 101, 25000);

        CurrentAccount current =
            new CurrentAccount("Rahul", 102, 40000);

        PremiumSavingsAccount premium =
            new PremiumSavingsAccount("Anu", 103, 75000);

        System.out.println("--- Savings Account ---");
        savings.displaySavings();

        System.out.println("\n--- Current Account ---");
        current.displayCurrent();

        System.out.println("\n--- Premium Savings Account ---");
        premium.displayPremium();
    }
}