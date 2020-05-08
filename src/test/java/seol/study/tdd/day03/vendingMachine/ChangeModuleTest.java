package seol.study.tdd.day03.vendingMachine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChangeModuleTest {

    @Test
    public void testReturnChangeCoinSet_oneCoin_50() {
        ChangeModule module = new ChangeModule();
        CoinSet expectedCoinSet = new CoinSet();
        expectedCoinSet.add(50);
        assertEquals(expectedCoinSet, module.getChangeCoinSet(50));
    }

    @Test
    public void testReturnChangeCoinSet_coins_180() {
        ChangeModule module = new ChangeModule();

        CoinSet expectedCoinSet = new CoinSet();
        expectedCoinSet.add(100);
        expectedCoinSet.add(50);
        expectedCoinSet.add(10);
        expectedCoinSet.add(10);
        expectedCoinSet.add(10);

        assertEquals(expectedCoinSet, module.getChangeCoinSet(180));
    }
}
