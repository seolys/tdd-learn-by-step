package seol.study.tdd.day02.account;

import junit.framework.TestCase;

public class AccountTest extends TestCase {

    private Account account;

    public void setUp() throws Exception {
        super.setUp();
        account = new Account(10000);
    }

    public void tearDown() throws Exception {
    }

    public void testGetBalance() {
        assertEquals(10000, account.getBalance());
    }

    public void testWithdraw() {
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());
    }

    public void testDeposit() {
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }
}