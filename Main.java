public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000);
        account.put(500);
        account.take(200);
        System.out.println("Account balance: " + account.getAmount());

        CreditAccount creditAccount = new CreditAccount(2000);
        creditAccount.take(300);
        System.out.println("Credit Account balance: " + creditAccount.getAmount());

        DepositAccount depositAccount = new DepositAccount(3000);
        depositAccount.take(1000);
        System.out.println("Deposit Account balance: " + depositAccount.getAmount());
    }
}