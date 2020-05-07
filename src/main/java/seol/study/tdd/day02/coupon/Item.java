package seol.study.tdd.day02.coupon;

public class Item {

    private final int price;
    private final String name;
    private String category;

    public Item(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return this.category;
    }
}
