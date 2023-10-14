import java.time.LocalDate;

public class DepositAccount extends Account {
    private LocalDate lastWithdrawalDate;

    public DepositAccount(double initialBalance) {
        super(initialBalance);
        lastWithdrawalDate = null;
    }

    @Override
    public void take(double amount) {
        LocalDate currentDate = LocalDate.now();
        if (lastWithdrawalDate == null || currentDate.isAfter(lastWithdrawalDate.plusMonths(1))) {
            super.take(amount);
            lastWithdrawalDate = currentDate;
        }
    }
}
