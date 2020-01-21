package edu.kis.vh.nursery;

public class IntArrayStack {
    private final static int ARRAY_SIZE = 12;
    private final static int NEGATIVE_ONE = -1;
    private int[] numbers;

    private int total = NEGATIVE_ONE;

    public IntArrayStack() {
        this.numbers  = new int[ARRAY_SIZE];
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NEGATIVE_ONE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return NEGATIVE_ONE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NEGATIVE_ONE;
        return numbers[total--];
    }

}
