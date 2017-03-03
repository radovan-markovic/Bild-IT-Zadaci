package zadaci_03_03_2017;

public class StackOfIntegers {

	//koristimo klasu iz knjige StackOfIntegers kako bismo sortirali brojeve
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	/**
	 * Constructs an empty stack with a default capacity of 16.
	 */
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
		//elements = new int[16];
	}

	/**
	 * Constructs an empty stack with a specified capacity.
	 * @param capacity
	 */
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	/**
	 * Returns true if the stack is empty.
	 * @return
	 */
	public boolean empty() {
		return size == 0;
	}

	/**
	 * Returns the integer at the top of the stack without removing it from the stack.
	 * @return
	 */
	public int peek() {
		return elements[size - 1];
	}

	/**
	 * Stores an integer into the top of the stack.
	 * @param value
	 */
	public void push(int value) {

		if(size >= elements.length) {
			int[] newStack = new int[elements.length * 2];

			for(int i = 0; i < elements.length; i++) {
				newStack[i] = elements[i];
			}
			elements = newStack;
		}
		elements[size++] = value;
	}

	/**
	 * Removes the integer at the top of the stack and returns it.
	 * @return
	 */
	public int pop() {
		int last = elements[--size];
		return last;
	}

	/**
	 * Returns the number of elements in the stack.
	 * @return
	 */
	public int getSize() {
		return size;
	}

}
