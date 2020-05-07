package seol.study.tdd.day02.coupon;

import java.util.ArrayList;
import java.util.List;

public class FakeCoupon implements Coupon {

    private List<String> categoryList = new ArrayList<>();

    public FakeCoupon() {
        categoryList.add("부엌칼");
        categoryList.add("아동 장난감");
        categoryList.add("조리기구");
    }

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
        if (categoryList.contains(item.getCategory())) {
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
