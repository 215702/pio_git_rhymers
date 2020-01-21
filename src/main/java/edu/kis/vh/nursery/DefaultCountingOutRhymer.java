package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public IntArrayStack customStack = new IntArrayStack();

    public void countIn(int in) {
        customStack.countIn(in);
    }

    public boolean callCheck() {
        return customStack.callCheck();
    }

    public boolean isFull() {
        return customStack.isFull();
    }

    protected int peekaboo() {
		return customStack.peekaboo();
    }

    public int countOut() {
		return customStack.countOut();
    }

}
