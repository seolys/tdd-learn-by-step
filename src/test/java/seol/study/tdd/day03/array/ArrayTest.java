package seol.study.tdd.day03.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.unitils.reflectionassert.ReflectionAssert.assertLenientEquals;

public class ArrayTest {

    @Test
    public void testArrayEqual() {
        String[] arrayA = new String[] {"A", "B", "C"};
        String[] arrayB = new String[] {"A", "B", "C"};
        assertArrayEquals(arrayA, arrayB);
    }

    @Test
    public void testArrayEqual_notSorted() {
        String[] arrayA = new String[] {"A", "B", "C"};
        String[] arrayB = new String[] {"B", "C", "A"};
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        assertArrayEquals(arrayA, arrayB);
    }

    @Test
    public void testArrayEqual_notSorted_unitils() {
        String[] arrayA = new String[] {"A", "B", "C"};
        String[] arrayB = new String[] {"B", "C", "A"};
        assertLenientEquals(arrayA, arrayB);
    }
}
