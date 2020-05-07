package seol.study.tdd.day02.coupon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {

    private PriceCalculator calculator;

    private Item createItem(String name, String category, int price) {
        return new Item(name, category, price);
    }

    @Before
    public void setUp() throws Exception {
        calculator = new PriceCalculator();
    }

    @Test
    public void testGetOrderPrice_discountableItem() {
        Item item = createItem("LightSavor", "부엌칼", 100000);
        Coupon coupon = new SpyCoupon();

        int price = calculator.getOrgerPrice(item, coupon);
        int methodCallCount = ((SpyCoupon) coupon).getIsAppliableCallCount();

        assertEquals("할인된 가격", 93000, price);
        assertEquals("coupon.isAppliable메소드 호출횟수", 1, methodCallCount);
    }

    @Test
    public void testGetOrderPrice_undiscountableItem() {
        Item item = new Item("R2D2", "알람시계", 20000);
        Coupon coupon = new StubCoupon();

        int price = calculator.getOrgerPrice(item, coupon);

        assertEquals("쿠폰적용 안되는 아이템", 20000, price);
    }

}
