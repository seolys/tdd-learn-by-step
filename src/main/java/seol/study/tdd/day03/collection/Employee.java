package seol.study.tdd.day03.collection;

public class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
