package seol.study.tdd.day04;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MailBoxTest {
    @Test
    public void newMailBox_should_empty() {
        MailBox mailBox = new MailBox();
        assertThat(mailBox.messageCount(), is(0));
    }
}
