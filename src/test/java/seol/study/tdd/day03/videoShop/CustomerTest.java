package seol.study.tdd.day03.videoShop;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static seol.study.tdd.day03.videoShop.VideoType.*;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("설연수");
    }

    @Test
    public void 비디오_한개대여_검증() {
        Video video = new Video(SPORT, "야구", 1);
        customer.rental(video, 1);
        List<Rental> rentalList = customer.getRentalList();
        assertEquals(video, rentalList.get(0).getVideo());
    }

    @Test
    public void 비디오_한개대여_포인트_검증() {
        Video video = new Video(SPORT, "야구", 1);
        customer.rental(video, 1);
        assertEquals(SPORT.point, customer.getTotalPoint());
    }

    @Test
    public void 비디오_한개이상_대여_포인트_검증() {
        Video video1 = new Video(SPORT, "야구", 1);
        Video video2 = new Video(DOCUMENTARY, "다큐", 1);
        Video video3 = new Video(MOVIE, "영화", 1);
        customer.rental(video1, 1);
        customer.rental(video2, 1);
        customer.rental(video3, 1);

        int point = SPORT.point + DOCUMENTARY.point + MOVIE.point;
        assertEquals(point, customer.getTotalPoint());
    }

    @Test
    public void 스포츠_비디오_한개대여_가격_검증() {
        Video video = new Video(SPORT, "야구", 1);
        customer.rental(video, 1);
        assertEquals(1, customer.getTotalPrice());
    }

    @Test
    public void 다큐_비디오_할인_미적용_가격_검증() {
        Video video = new Video(DOCUMENTARY, "다큐", 1000);
        customer.rental(video, 2);
        assertEquals(2000, customer.getTotalPrice());
    }

    @Test
    public void 다큐_비디오_할인_적용_가격_검증() {
        Video video = new Video(DOCUMENTARY, "다큐", 1000);
        customer.rental(video, 4);
        int price = (int) (3000 + (1000 * DOCUMENTARY.discountRate));
        assertEquals(price, customer.getTotalPrice());
    }

    @Test
    public void 영화_비디오_할인_미적용_가격_검증() {
        Video video = new Video(MOVIE, "영화", 1000);
        customer.rental(video, 2);
        assertEquals(2000, customer.getTotalPrice());
    }

    @Test
    public void 영화_비디오_할인_적용_가격_검증() {
        Video video = new Video(MOVIE, "영화", 1000);
        customer.rental(video, 4);
        int price = (int) (2000 + (2000 * MOVIE.discountRate));
        assertEquals(price, customer.getTotalPrice());
    }

}
