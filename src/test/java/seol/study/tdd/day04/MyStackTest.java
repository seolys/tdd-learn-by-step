package seol.study.tdd.day04;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.ArrayDeque;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MyStackTest {
    @Test
    public void pop_should_return_pushed_value() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);

        assertThat(stack.pop(), is(2));
        assertThat(stack.pop(), is(1));
    }
}
