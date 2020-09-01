package seol.study.tdd.day04;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void canRoll() {
        Game game = new Game();
        game.roll();
    }
}
