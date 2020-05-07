package seol.study.tdd.day02.coupon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    private User user;

    @Before
    public void setUp() {
        user = new User("area88");
    }

    @Test
    public void testGetTotalCoupon() {
        assertEquals("쿠폰 수령 전", 0, user.getTotalCouponCount());
    }

    @Test
    public void testAddCoupon() {
        user.addCoupon(new DummyCoupon());
        assertEquals("쿠폰 수령 후", 1, user.getTotalCouponCount());
    }

    @Test
    public void testGetLastOccupiedCoupon() {
        user.addCoupon(new StubCoupon());
        Coupon lastCoupon = user.getLastOccupiedCoupon();

        assertEquals("쿠폰할인율", 7, lastCoupon.getDiscountPercent());
        assertEquals("쿠폰 이름", "VIP 고객 한가위 감사쿠폰", lastCoupon.getName());
    }





}
