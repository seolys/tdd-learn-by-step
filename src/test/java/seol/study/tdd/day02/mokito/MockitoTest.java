package seol.study.tdd.day02.mokito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.*;

public class MockitoTest {

    private List mockedList;

    @Before
    public void setUp() {
        mockedList = mock(List.class); // Mock객체 만들기
    }

    @Test
    public void test() {
        mockedList.add("item");
        mockedList.clear();

        verify(mockedList).add("item"); // mockedList.add("item")가 1번 실행되었다면 통과.
        verify(mockedList).clear(); // mockedList.clear();가 1번 실행되었다면 통과.
    }

    @Test
    public void testWhenReturn() {
        // 예상값 지정.
        when(mockedList.get(0)).thenReturn("item"); // mockedList.get(0) 호출 시 "item"을 리턴한다.
        when(mockedList.size()).thenReturn(100); // mockedList.size() 호출 시 100을 리턴한다

        // 예상값 확인.(콘솔에 출력)
        System.out.println(mockedList.get(0)); // item
        System.out.println(mockedList.size()); // 100
        System.out.println(mockedList.get(2)); // null

        // 메소드 호출
        mockedList.add("item");
        mockedList.add("item");

        // 검증
        verify(mockedList, atLeastOnce()).add("item"); // atLeastOnce() : mockedList.add("item")가 1번이상 실행 됨.
        verify(mockedList, times(2)).add("item"); // times(2) : mockedList.add("item")가 2번 실행됨.
        verify(mockedList).size(); // mockedList.size()가 1번 실행됨.
        verify(mockedList, atLeastOnce()).get(0);
        verify(mockedList, atLeastOnce()).get(2);
        verify(mockedList, atLeastOnce()).get(anyInt()); // 아무 int값이나 1번이상 실행
        verify(mockedList, never()).contains("실행안됨"); // 실행안됨.
    }


    @Test
    public void testWhenThrow() {
        // 예상값 지정.
        when(mockedList.get(1)).thenThrow(new RuntimeException()); // mockedList.get(1) 호출 시 throw new RuntimeException();

        try {
            System.out.println(mockedList.get(1)); // Exception이 발생하여 출력하지 않음.
        } catch (RuntimeException e) {
            System.out.println(e.getClass().getName()); // RuntimeException
        }

        verify(mockedList).get(1);
    }

}
