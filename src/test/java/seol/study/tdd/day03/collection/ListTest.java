package seol.study.tdd.day03.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListTest {
    @Test
    public void testListEqual_primitive() {
        List<String> listA = new ArrayList<>();
        listA.add("변정훈");
        listA.add("조연희");

        List<String> listB = new ArrayList<>();
        listB.add("변정훈");
        listB.add("조연희");
        assertEquals(listA, listB);
    }

    @Test
    public void testListEqual_instance() {
        List<Employee> listA = new ArrayList<>();
        listA.add(new Employee("변정훈"));
        listA.add(new Employee("조연희"));

        List<Employee> listB = new ArrayList<>();
        listB.add(new Employee("변정훈"));
        listB.add(new Employee("조연희"));
        assertEquals(listA.toString(), listB.toString());
    }
}
