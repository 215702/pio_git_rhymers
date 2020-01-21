package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int ARRAY_SIZE = 12;
	public static final int INDICATOR = -1;
	public static final int DEFAULT = -1;
	private int[] numbers = new int[ARRAY_SIZE];

	public int total = INDICATOR;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == INDICATOR;
	}

	public boolean isFull() {
		return total == ARRAY_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT;
		return numbers[total--];
	}

}
