package seol.study.tdd.day03.equivalent;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MusicTest {

    @Test
    public void testEquals_case1() {
        Music musicA = createMusic("Better in time", "Leona Lewis");
        Music musicB = musicA;
        assertEquals(musicA, musicB);
    }

    @Test
    public void testEquals_case2() {
        Music musicA = createMusic("Better in time", "Leona Lewis");
        Music musicB = createMusic("Better in time", "Leona Lewis");
        assertEquals(musicA, musicB);
    }

    private Music createMusic(String songName, String performerName) {
        return new Music(songName, performerName);
    }



}
