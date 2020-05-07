package seol.study.tdd.day02.coupon;

public class DummyCoupon implements Coupon {
    @Override
    public int getDiscountPercent() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isAppliable(Item item) {
        return false;
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public void doExpire() {

    }
}
