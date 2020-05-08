package seol.study.tdd.day03.vendingMachine;

public class VendingMachine {
    private int changeAmount = 0;

    public void putCoin(int coin) {
        this.changeAmount += coin;
    }

    public int getChangeAmount() {
        return changeAmount;
    }

    public void selectDrink(Drink drink) {
        changeAmount -= drink.getPrice();
    }

    public CoinSet getChangeCoinSet() {
        return new ChangeModule().getChangeCoinSet(changeAmount);
    }
}
