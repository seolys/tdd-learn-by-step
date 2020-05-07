package seol.study.tdd.day02.coupon;

import seol.study.tdd.day02.coupon.Coupon;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Coupon> couponList = new ArrayList<>();

    public User(String area88) {
    }

    public int getTotalCouponCount() {
        return couponList.size();
    }

    public void addCoupon(Coupon coupon) {
        couponList.add(coupon);
    }

    public Coupon getLastOccupiedCoupon() {
        return couponList.size() == 0 ? null : couponList.get(couponList.size() - 1);
    }
}
