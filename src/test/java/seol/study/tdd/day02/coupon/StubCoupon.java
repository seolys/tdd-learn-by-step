package seol.study.tdd.day02.coupon;

public class StubCoupon implements Coupon {
    @Override
    public int getDiscountPercent() {
        return 7;
    }

    @Override
    public String getName() {
        return "VIP 고객 한가위 감사쿠";
    }

    @Override
    public boolean isAppliable(Item item) {
        if (item == null) {
            return false;
        }
        String category = item.getCategory();
        if ("부엌칼".equals(category)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void doExpire() {

    }
}
