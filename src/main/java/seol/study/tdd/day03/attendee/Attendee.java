package seol.study.tdd.day03.attendee;

import java.util.ArrayList;
import java.util.List;

public class Attendee {
    private final List<String> attendeeList = new ArrayList<>();

    public boolean add(String attendee) {
        return attendeeList.add(attendee);
    }

    public String get(int i) {
        return attendeeList.get(i);
    }
}
