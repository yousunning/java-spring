package collection.linkedlist;

import java.util.LinkedList; //생성자 

public class LinkedListTest {

	public static void main(String[] args) {
		// list 인터페이스를 구현한 LinkedList 테스트
		LinkedList<String> myList = new LinkedList<String>();

		myList.add("A");
		myList.add("B");
		myList.add("C");

		System.out.println(myList);
		myList.add(1, "D");
		System.out.println(myList);

		myList.addFirst("O");
		System.out.println(myList);

		System.out.println(myList.removeLast());// 삭제값 리턴C
		System.out.println(myList);

	}

}
