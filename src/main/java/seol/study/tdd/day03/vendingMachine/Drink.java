package seol.study.tdd.day03.vendingMachine;

public class Drink {
    private final String name;
    private final int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
