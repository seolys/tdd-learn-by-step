package seol.study.tdd.day04;

public class MyStack {
    private int STACK_SIZE = 100;
    private int[] value = new int[STACK_SIZE];
    private int index = 0;

    public int pop() {
        return value[--index];
    }

    public void push(int value) {
        this.value[index++] = value;
    }
}
