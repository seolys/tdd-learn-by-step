package seol.study.tdd.day03.vendingMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CoinSet {
    List<Integer> coinSets = new ArrayList<>();

    public void add(int coin) {
        coinSets.add(coin);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoinSet coinSet = (CoinSet) o;
        return Objects.equals(coinSets, coinSet.coinSets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coinSets);
    }
}
