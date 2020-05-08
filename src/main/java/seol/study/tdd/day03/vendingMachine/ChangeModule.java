package seol.study.tdd.day03.vendingMachine;

public class ChangeModule {
    final int[] coinKind = {500, 100, 50, 10};

    enum COIN {
        KRW500(500),
        KRW100(100),
        KRW50(50),
        KRW10(10)
        ;
        private final int value;
        COIN(int value){
            this.value = value;
        }
    }

    public CoinSet getChangeCoinSet(int changeAmount) {
        CoinSet coinSet = new CoinSet();

        int remainChangeAmount = changeAmount;
        for (COIN coin : COIN.values()) {
            remainChangeAmount = addCoinsToCoinSet(remainChangeAmount, coinSet, coin.value);
        }
        return coinSet;
    }

    private int addCoinsToCoinSet(int changeAmount, CoinSet coinSet, int coinValue) {
        int remainChangeAmount = changeAmount;
        while (isGreaterCoinValue(remainChangeAmount, coinValue)) {
            coinSet.add(coinValue);
            remainChangeAmount -= coinValue;
        }
        return remainChangeAmount;
    }

    private boolean isGreaterCoinValue(int changeAmount, int coinValue) {
        return changeAmount >= coinValue;
    }


}
