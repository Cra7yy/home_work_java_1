import java.time.LocalDate;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void put(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void take(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getAmount() {
        return balance;
    }
}
