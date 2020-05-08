package seol.study.tdd.day02.account;

import junit.framework.TestCase;

public class AccountTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() {
    }

    private Account createAccount(int money) {
        return new Account(money);
    }

    public void testGetBalance() {
        Account account = createAccount(10000);
        assertEquals(10000, account.getBalance());
    }

    public void testWithdraw() {
        Account account = createAccount(10000);
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());
    }

    public void testDeposit() {
        Account account = createAccount(10000);
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }
}