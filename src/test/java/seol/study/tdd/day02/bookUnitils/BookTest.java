package seol.study.tdd.day02.bookUnitils;

import org.junit.Test;

import static org.unitils.reflectionassert.ReflectionAssert.assertPropertyLenientEquals;
import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;
import static org.unitils.reflectionassert.ReflectionComparatorMode.*;

public class BookTest {
    @Test
    public void testBook() {
        Book aBook = new Book("사람은 무엇으로 사는가?", "톨스토이", 9000);
        Book bBook = new Book("사람은 무엇으로 사는가?", "톨스토이", 9000);

        // 동일성 비교 => 실패
//        assertEquals(aBook, bBook);

        // 동치성 비교 - 리플렉션 단정문
        assertReflectionEquals(aBook, bBook); //

        // 너그러운 비교 옵션
        assertReflectionEquals(aBook, bBook, LENIENT_ORDER); // 컬렉션, 배열비교할때 순서 생략
        assertReflectionEquals(aBook, bBook, IGNORE_DEFAULTS); // 필드 중 타입 기본값 생략
        assertReflectionEquals(aBook, bBook, LENIENT_DATES); // 시간/날짜 비교 생략
        assertReflectionEquals(aBook, bBook, LENIENT_ORDER, IGNORE_DEFAULTS, LENIENT_DATES);

        // getter메소드 없이 리플렉션으로 필드값 비교
        // assertPropertyLenientEquals(속성이름, 속성값, 객체);
        assertPropertyLenientEquals("author", "톨스토이", aBook);
        assertPropertyLenientEquals("price", 9000, aBook);
    }

}