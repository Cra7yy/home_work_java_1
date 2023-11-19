import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testAccountDeposit() {
        AbstractAccount account = new Account(0);
        account.put(500);
        Assertions.assertEquals(500, account.getAmount());
    }

    @Test
    public void testAccountWithdrawal() {
        AbstractAccount account = new Account(1000);
        account.take(200);
        Assertions.assertEquals(800, account.getAmount());
    }

    @Test
    public void testCreditAccountWithdrawalWithFee() {
        AbstractAccount creditAccount = new CreditAccount(2000);
        creditAccount.take(300);
        Assertions.assertEquals(1707, creditAccount.getAmount(), 0.01);
    }

    @Test
    public void testDepositAccountWithdrawalAfterOneMonth() {
        AbstractAccount depositAccount = new DepositAccount(3000);
        depositAccount.take(1000);
        Assertions.assertEquals(2000, depositAccount.getAmount());

        depositAccount.take(500);
        Assertions.assertEquals(1500, depositAccount.getAmount());
    }
}
