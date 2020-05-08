package seol.study.tdd.day03.videoShop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static seol.study.tdd.day03.videoShop.VideoType.SPORT;

public class VideoTest {

    @Test
    public void createVideo() {
        Video video = new Video(SPORT, "야구", 1000);
        assertEquals(SPORT, video.getType());
        assertEquals(1000, video.getPrice());
    }
}
