package edu.kis.vh.nursery.list;

/**
 * Podstawowa implementacja linked list używająca int jako typu danych elementów
 */
public class IntLinkedList {

	private static final int NEGATIVE_ONE = -1;
	private Node last;
	/**
	 * Metoda wypychająca element i na koniec listy
	 * @param i element który chcemy dodać do listy
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	/**
	 * Metoda służąca do zweryfikowania pustości listy
	 * @return ostatni element, lub null gdy lista jest pusta
	 */
	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	/**
	 * Metoda służąca do odczytania ostatniego elementu listy
	 * @return ostatni element, lub -1 gdy lista jest pusta
	 */
	public int top() {
		if (isEmpty())
			return NEGATIVE_ONE;
		return last.value;
	}
	/**
	 * Metoda usuwa ostatni element listy i zwraca go
	 * @return ostatni element, lub -1 gdy lista jest pusta
	 */
	public int pop() {
		if (isEmpty())
			return NEGATIVE_ONE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}
}
