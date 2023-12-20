package collection.arraylist;

import java.util.ArrayList;

class MyStack { // 출력 클래스 
	private ArrayList<String> arrayStack = new ArrayList<String>();

	public void push(String data) {
		arrayStack.add(data);
	}

	public String pop() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("스택 비어있음.");
			return null;
		}
		return (arrayStack.remove(len - 1));
	}
}

public class StackTest {

	public static void main(String[] args) {
		// Arraylist로 Stack자료구조 구현 테스트
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");

		// System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
