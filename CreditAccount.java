public class CreditAccount extends Account {
    public CreditAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void take(double amount) {
        if (amount > 0 && amount <= getAmount()) {
            double fee = amount * 0.01; // 1% fee
            super.take(amount + fee);
        }
    }
}
