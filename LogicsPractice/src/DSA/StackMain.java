package DSA;

class Stack {
	static int[] stack;
	static int top;

	public Stack(int size) {
		stack = new int[size];
		top = -1;
	}

	public static boolean isEmpty() {
		return top == -1;
	}

	public static boolean isFull() {
		return top == stack.length - 1;
	}

	public static void push(int value) {
		if (isFull()) {
			System.out.println("stack is full");
		} else {
			stack[++top] = value;
			System.out.println(value + " added to stack");
		}
	}

	public static void pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
		} else {
			int value = stack[top];
			top--;
			System.out.println("value is deleted " + value);
		}
	}

	public static void peek() {
		if (isEmpty()) {
			System.out.println("stack is empty");
		} else {
			System.out.println(stack[top]);
		}
		
	}
	public static void delete() {
		stack=null;
	}

}

public class StackMain {
	public static void main(String[] args) {

	}
}
