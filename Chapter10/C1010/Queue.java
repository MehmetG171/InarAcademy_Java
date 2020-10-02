package PackageChapter10;

public class Queue {

	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 8;

	public Queue() {
		this(DEFAULT_CAPACITY);
	}

	public Queue(int capacity) {
		elements = new int[capacity];
	}

	public void enqueue(int v) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = v;
	}

	public int dequeue() {
		int v = elements[0];

		int[] temp = new int[size - 1];
		for (int i = 0, j = 1; j < size; j++, i++) {
			temp[i] = elements[j];
		}

		size--;
		elements = temp;
		return v;
	}

	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}
}
