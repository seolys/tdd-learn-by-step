package seol.study.tdd.day01.account;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AccountTest {

    public Account createAccount(int money){
        return new Account(money);
    }

    @Test
    public void testGetBalance() throws Exception {
        Account account = createAccount(10000);
        assertEquals("10000원으로 계좌 생성 후 잔고 조회",10000, account.getBalance());

        account = createAccount(1000);
        assertEquals("1000원으로 계좌 생성 후 잔고 조회",1000, account.getBalance());

        account = createAccount(0);
        assertEquals("0원으로 계좌 생성 후 잔고 조회",0, account.getBalance());
    }

    @Test
    public void testDeposit() throws Exception {
        // given
        Account account = createAccount(10000);

        // when
        account.deposit(1000);

        // then
        assertEquals(11000, account.getBalance());
    }

    @Test
    public void testWithdraw() throws Exception {
        // given
        Account account = createAccount(10000);

        // when
        account.withdraw(1000);

        // then
        assertEquals(9000, account.getBalance());
    }

}
