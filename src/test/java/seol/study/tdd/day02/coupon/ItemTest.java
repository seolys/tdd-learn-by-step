package seol.study.tdd.day02.coupon;

import org.junit.Test;

class ItemTest {
    @Test
    public void createItem() {
        Item item = new Item("LightSavor", "부엌칼", 100000);
    }
}
