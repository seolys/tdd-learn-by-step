package seol.study.tdd.day01.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void 숫자_0_더하기_0() {
        int sum = calculator.sum(0, 0);
        assertThat(sum, is(0));
    }

    @Test
    public void 숫자_1_더하기_1() {
        int sum = calculator.sum(1, 1);
        assertThat(sum, is(2));
    }


}
