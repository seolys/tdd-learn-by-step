package seol.study.tdd.day02.coupon;

public class PriceCalculator {
//    public int getOrgerPrice(Item item, Coupon coupon) {
//        return item.getPrice() - getDiscountPrice(item, coupon);
//    }
//
//    private int getDiscountPrice(Item item, Coupon coupon) {
//        return (int) (item.getPrice() * (coupon.getDiscountPercent() * 0.01));
//    }

    public int getOrgerPrice(Item item, Coupon coupon) {
        if (isUseAble(item, coupon)) {
            return (int) (item.getPrice() * getDiscountRate(coupon.getDiscountPercent()));
        }
        return item.getPrice();
    }

    private boolean isUseAble(Item item, Coupon coupon) {
        return coupon.isValid() && coupon.isAppliable(item);
    }

    private double getDiscountRate(int discountPercent) {
        return (100 - discountPercent) / 100d;
    }

}
