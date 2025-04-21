package Daily_Task;

public class Task_19April_Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setAccountHolder("Rupam");
        acc.setBalance(5000);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: ₹" + acc.getBalance());

        acc.deposit(1500);
        System.out.println("After deposit, Balance: ₹" + acc.getBalance());

        acc.withdraw(2000);
        System.out.println("After withdrawal, Balance: ₹" + acc.getBalance());
    }
}

class BankAccount {
    private String accountHolder;
    private double balance;

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for accountHolder
    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

}
