package seol.study.tdd.day04;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class WordwrapTest {
    WordWrap wordWrap;

    @Before
    public void setUp() throws Exception {
        wordWrap = new WordWrap();
    }

    @Test
    public void wrap() {
        assertWraps(null, 1, "");
        assertWraps("", 1, "");
        assertWraps("x", 1, "x");
        assertWraps("xx", 1, "x\nx");
        assertWraps("xxx", 1, "x\nx\nx");
        assertWraps("x x", 1, "x\nx");
        assertWraps("x xx", 3, "x\nxx");
    }

    private void assertWraps(String s, int width, String value) {
        assertThat(wordWrap.wrap(s, width), is(value));
    }


}
