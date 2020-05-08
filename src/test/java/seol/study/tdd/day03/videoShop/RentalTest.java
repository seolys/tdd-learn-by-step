package seol.study.tdd.day03.videoShop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static seol.study.tdd.day03.videoShop.VideoType.SPORT;

public class RentalTest {
    @Test
    public void createRental() {
        Video video = new Video(SPORT, "야구", 1000);
        Rental rental = new Rental(video, 1);
        assertEquals(video, rental.getVideo());
        assertEquals(1, rental.getDays());
    }
}
