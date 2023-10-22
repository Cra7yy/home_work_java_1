import java.time.LocalDate;

public class CreditAccount extends AbstractAccount {
    public CreditAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void take(double amount) {
        double fee = amount * 0.01;
        super.take(amount + fee);
    }
}
