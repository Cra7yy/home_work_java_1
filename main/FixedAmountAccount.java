package main;
public class FixedAmountAccount extends AbstractAccount {

    public FixedAmountAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void take(double amount) {}
}
