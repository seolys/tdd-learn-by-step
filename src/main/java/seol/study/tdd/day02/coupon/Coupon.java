package seol.study.tdd.day02.coupon;

public interface Coupon {
    int getDiscountPercent();

    String getName();

    boolean isAppliable(Item item);

    boolean isValid();

    void doExpire();
}
