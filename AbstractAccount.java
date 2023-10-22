import java.time.LocalDate;

public abstract class AbstractAccount {

    private double balance;

    public AbstractAccount(double initialBalance) {
        balance = initialBalance;
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

    protected void doTake(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
