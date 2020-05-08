package seol.study.tdd.day03.attendee;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttendeeTest {
    private Attendee attendee;

    @Before
    public void setUp() {
        this.attendee = new Attendee();
    }

    @Test
    public void testAdd() {
        attendee.add("설연수");
        assertEquals("설연수", attendee.get(0));
    }

}
