package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int ARRAY_SIZE = 12;
	public static final int NEGATIVE_ONE = -1;
	private int[] numbers = new int[ARRAY_SIZE];

	public int total = NEGATIVE_ONE;

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
